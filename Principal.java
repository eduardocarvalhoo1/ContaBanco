import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Principal {

    private static Conta conta = new Conta();
    private static List <Conta> bd = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            conta = new Conta();
            double saldo = 0.0;
            double deposito = 0.0;
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
                    conta.setNumero(numero);
                    loop = false;
                } catch (NumGrdException e) {
                    e.erro();
                } catch (NumPeqException e) {
                    e.erroPeq();
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                    sc.nextLine();
                }
            }

            System.out.println("Informe o nome do titular da conta: ");
            String titular = sc.nextLine();
            conta.setTitular(titular);

            boolean validSaldo = false;
            while (!validSaldo) {
                try {
                    System.out.println("Informe o saldo inicial: ");
                    saldo = sc.nextDouble();
                    conta.setSaldo(saldo);
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
                    conta.deposito(deposito);
                    System.out.println();
                    System.out.println(conta);
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
                    conta.saque(saque);
                    System.out.println();
                    System.out.println(conta);
                    System.out.println();
                    saldo += deposito - saque;
                    validSaque = true;
                } catch (SaqueException e) {
                    e.limtSaque();
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
            }

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
                    System.out.println(contaEmpresarial);
                    break;
                case 2:
                    double aumento;
                    ContaEstudantil contaEstudantil = new ContaEstudantil();
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
                    System.out.println("Seu limite era de R$ 15000.00 agora é de R$" + contaEstudantil.getLimiteEmprestimoEstudantil());
                    break;
                case 3:
                    Poupanca poupanca = new Poupanca();
                    poupanca.setSaldo(saldo);
                    System.out.println("Saldo antes dos juros: " + poupanca.getSaldo());
                    poupanca.saldoAtualizado();
                    System.out.println("Saldo com juros: " + poupanca.getSaldo());
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
                    for (Conta conta : bd) {
                        System.out.println(conta.getNumero() + ", Titular: "
                                + conta.getTitular() + ", Saldo: R$" + conta.getSaldo());
                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta que deseja consultar: ");
                    int n = sc.nextInt();
                    for (Conta conta : bd) {
                        if (conta.getNumero() == n) {
                            System.out.println("Número: " + conta.getNumero() + ", Titular: "
                                    + conta.getTitular() + ", Saldo: R$" + conta.getSaldo());
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
                    for (Conta conta : bd){
                        if (conta.getNumero() == num2){
                            System.out.println("Digite o novo nome do Titular: ");
                            sc.nextLine();
                            String NovoNome = sc.nextLine();
                            conta.setTitular(NovoNome);
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
