import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Principal {

    private static List<Conta> bd = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            double saldo = 0.0;
            double deposito;
            double saque;

            int op = -1;
            boolean validOp = false;

            while (!validOp) {
                try {
                    System.out.println("Escolha o tipo de conta: ");
                    System.out.println("1) CONTA EMPRESARIAL");
                    System.out.println("2) CONTA ESTUDANTIL");
                    System.out.println("3) CONTA POUPANÇA");
                    op = sc.nextInt();

                    if (op >= 1 && op <= 3) {
                        validOp = true;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                        System.out.println();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida. Tente novamente.");
                    sc.nextLine(); // Limpa o buffer do scanner
                    System.out.println();
                }
            }

            int numero = 0; // Declare a variável numero fora do bloco try-catch
            boolean loop = true;
            while (loop) {
                try {
                    System.out.println("Informe o número da conta: ");
                    numero = sc.nextInt();
                    sc.nextLine();
                    loop = false;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                    sc.nextLine();
                }
            }

            System.out.println("Informe o nome do titular da conta: ");
            String titular = sc.nextLine();

            boolean validSaldo = false;
            while (!validSaldo) {
                try {
                    System.out.println("Informe o saldo inicial: ");
                    saldo = sc.nextDouble();
                    validSaldo = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
            }

            boolean validDeposito = false;
            while (!validDeposito) {
                try {
                    System.out.println("Digite o valor do deposito: ");
                    deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println();
                    validDeposito = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
            }

            boolean validSaque = false;
            while (!validSaque) {
                try {
                    System.out.println("Digite o valor do saque: ");
                    saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println();
                        System.out.println();
                        validSaque = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
            }

            Conta conta = null;

            switch (op) {
                case 1:
                    ContaEmpresarial contaEmpresarial = new ContaEmpresarial();
                    try {
                        contaEmpresarial.setNumero(numero);
                    } catch (NumGrdException e) {
                        e.erro();
                    } catch (NumPeqException e) {
                        e.erroPeq();
                    }
                    contaEmpresarial.setTitular(titular);
                    contaEmpresarial.setSaldo(saldo);
                    boolean validEmprestimo = false;
                    while (!validEmprestimo) {
                        try {
                            System.out.println("Digite o valor do emprestimo: ");
                            double emp = sc.nextDouble();
                            contaEmpresarial.emprestimo(emp);
                            validEmprestimo = true;
                        } catch (EmprestimoException e) {
                            e.limtEmprestimo();
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                            sc.nextLine();
                        }
                    }
                    conta = contaEmpresarial;
                    break;
                case 2:
                    double aumento;
                    ContaEstudantil contaEstudantil = new ContaEstudantil();
                    try {
                        contaEstudantil.setNumero(numero);
                    } catch (NumGrdException e) {
                        e.erro();
                    } catch (NumPeqException e) {
                        e.erroPeq();
                    }
                    contaEstudantil.setTitular(titular);
                    contaEstudantil.setSaldo(saldo);
                    System.out.println("Digite o nome da instituição: ");
                    sc.nextLine();
                    String instituicao = sc.nextLine();
                    contaEstudantil.setInstuicao(instituicao);
                    boolean validAumento = false;
                    while (!validAumento) {
                        try {
                            System.out.println("Digite o valor do aumento do emprestimo: ");
                            aumento = sc.nextDouble();
                            contaEstudantil.aumentarLimite(aumento);
                            validAumento = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                            sc.nextLine();
                        }
                    }
                    conta = contaEstudantil;
                    System.out.println("Seu limite era de R$ 15000.00 agora é de R$" + contaEstudantil.getLimiteEmprestimoEstudantil());
                    break;
                case 3:
                    Poupanca poupanca = new Poupanca();
                    try {
                        poupanca.setNumero(numero);
                    } catch (NumGrdException e) {
                        e.erro();
                    } catch (NumPeqException e) {
                        e.erroPeq();
                    }
                    poupanca.setTitular(titular);
                    poupanca.setSaldo(saldo);
                    System.out.println("Saldo antes dos juros: " + poupanca.getSaldo());
                    poupanca.saldoAtualizado();
                    System.out.println("Saldo com juros: " + poupanca.getSaldo());
                    conta = poupanca;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (conta != null) {
                bd.add(conta);
            }

            System.out.println();
            System.out.println("Deseja criar mais uma conta? <s/n>");
            sc.nextLine();
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        boolean cont = true;
        while (cont) {
            System.out.println();
            System.out.println("1) RELATÓRIO GERAL DE CONTAS");
            System.out.println("2) CONSULTAR CONTA");
            System.out.println("3) EXCLUIR CONTA");
            System.out.println("4) ALTERAR NOME DO PROPRIETÁRIO DA CONTA");
            System.out.println("5) SAIR");
            int op2 = sc.nextInt();

            switch (op2) {
                case 1:
                    for (Conta c : bd) {
                        System.out.println(c.getNumero() + ", Titular: "
                                + c.getTitular() + ", Saldo: R$" + c.getSaldo());
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta que deseja consultar: ");
                    int n = sc.nextInt();
                    for (Conta c : bd) {
                        if (c.getNumero() == n) {
                            System.out.println("Número: " + c.getNumero() + ", Titular: "
                                    + c.getTitular() + ", Saldo: R$" + c.getSaldo());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta que deseja excluir: ");
                    int num = sc.nextInt();
                    for (int i = 0; i < bd.size(); i++) {
                        if (bd.get(i).getNumero() == num) {
                            bd.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta que deseja alterar: ");
                    int num2 = sc.nextInt();
                    for (Conta c : bd) {
                        if (c.getNumero() == num2) {
                            System.out.println("Digite o novo nome do Titular: ");
                            sc.nextLine();
                            String NovoNome = sc.nextLine();
                            c.setTitular(NovoNome);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Opção Inválida");
            }
        }
        sc.close();
    }
}

