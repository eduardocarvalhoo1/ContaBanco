// Eduardo Carvalho de Oliveira 2614529
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;

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
            }
        }

        conta = new Conta();
        int numero = 0; // Declare a variável 'numero' fora do bloco try-catch
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
        }

        System.out.println("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Informe o saldo inicial: ");
        double saldo = sc.nextDouble();

        conta = new Conta(numero, titular, saldo);

        System.out.println("Digite o valor do deposito: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println();
        System.out.println(conta);

        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println();
        System.out.println(conta);
        System.out.println();

        saldo += deposito - saque;

        switch (op){
            case 1:
                ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial(numero, titular, saldo, 30000.00);
                System.out.println("Digite o valor do emprestimo: ");
                double emp = sc.nextDouble();
                contaEmpresarial1.emprestimo(emp);
                System.out.println(contaEmpresarial1);
                break;
            case 2:
                System.out.println("Digite o nome da instituição: ");
                sc.nextLine();
                String instituicao = sc.nextLine();
                System.out.println("Digite o valor do  aumento do emprestimo: ");
                double limtEmp = sc.nextDouble();
                ContaEstudantil contaEstudantil = new ContaEstudantil(numero, titular, saldo, instituicao,limtEmp);
                contaEstudantil.setLimiteEmprestimoEstudantil(limtEmp);
                break;
            case 3:
                Poupanca poupanca = new Poupanca(numero, titular, saldo, 0.02);
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