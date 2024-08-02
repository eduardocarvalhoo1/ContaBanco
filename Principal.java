// Eduardo Carvalho de Oliveira 2614529
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

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
                }
                else {
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Opção inválida. Tente novamente.");
                sc.nextLine(); // Limpa o buffer do scanner
                System.out.println();
            }
        }

        //conta = new Conta();
        int numero = 0; // Declare a variável numero fora do bloco try-catch
        boolean loop = true;
        while (loop){
            try {
                System.out.println("Informe o número da conta: ");
                numero = sc.nextInt();
                sc.nextLine();
                conta.setNumero(numero);
                loop = false;
            }
            catch (NumGrdException e) {
                e.erro ();
            }
            catch (NumPeqException e) {
                e.erroPeq();
            }
            catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                sc.nextLine();
            }
        }

        System.out.println("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();
        conta.setTitular(titular);

        try {
            System.out.println("Informe o saldo inicial: ");
            saldo = sc.nextDouble();
            conta.setSaldo(saldo);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
            sc.nextLine();
        }

       // conta = new Conta(numero, titular, saldo);
        try {
            System.out.println("Digite o valor do deposito: ");
            deposito = sc.nextDouble();
            conta.deposito(deposito);
            System.out.println();
            System.out.println(conta);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
            sc.nextLine();
        }

        try {
            System.out.println("Digite o valor do saque: ");
            saque = sc.nextDouble();
            conta.saque(saque);
            System.out.println();
            System.out.println(conta);
            System.out.println();
            saldo += deposito - saque;
        }
        catch (SaqueException e){
            e.limtSaque();
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
            sc.nextLine();
        }

        switch (op){
            case 1:
                //ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial(numero, titular, saldo, 30000.00);
                ContaEmpresarial contaEmpresarial = new ContaEmpresarial();
                try {
                    contaEmpresarial.setNumero(numero);
                }
                catch (NumGrdException e) {
                    e.erro();
                }
                catch (NumPeqException e) {
                    e.erroPeq();
                }
                contaEmpresarial.setTitular(titular);
                contaEmpresarial.setSaldo(saldo);
                try {
                    System.out.println("Digite o valor do emprestimo: ");
                    double emp = sc.nextDouble();
                    contaEmpresarial.emprestimo(emp);
                }
                catch (EmprestimoException e){
                    e.limtEmprestimo();
                }
                catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
                System.out.println(contaEmpresarial);
                break;
            case 2:
                double aumento = 0.0;
                ContaEstudantil contaEstudantil = new ContaEstudantil();
                System.out.println("Digite o nome da instituição: ");
                sc.nextLine();
                String instituicao = sc.nextLine();
                contaEstudantil.setInstuicao(instituicao);
                try {
                    System.out.println("Digite o valor do aumento do emprestimo: ");
                    aumento = sc.nextDouble();
                }
                catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um valor.");
                    sc.nextLine();
                }
                contaEstudantil.aumentarLimite(aumento);
                //contaEstudantil.setLimiteEmprestimoEstudantil(limtEmp);
                System.out.println("Seu limite agora é de R$" + contaEstudantil.getLimiteEmprestimoEstudantil());
                break;
            case 3:
                Poupanca poupanca = new Poupanca();
                poupanca.setSaldo(saldo);
                System.out.println("Saldo antes dos juros: " + poupanca.getSaldo());
                poupanca.saldoatualizado();
                System.out.println("Saldo com juros: " + poupanca.getSaldo());
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}