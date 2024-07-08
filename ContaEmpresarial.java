// Eduardo Carvalho de Oliveira 2614529
public class ContaEmpresarial extends Conta{

    private Double limtemprestimo;
    private Double taxa = 3.00;

    public ContaEmpresarial() {
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limtemprestimo) {
        super(numero, titular, saldo);
        this.limtemprestimo = limtemprestimo;
    }

    public Double getLimtemprestimo() {
        return limtemprestimo;
    }

    public void setLimtemprestimo(Double limtemprestimo) {
        this.limtemprestimo = limtemprestimo;
    }

    public void emprestimo (double quantia){
        if (quantia <= limtemprestimo){
            saldo += quantia;
        }
    }

    // Sobrescrita
    @Override
    public void saque(double quantia){
        super.saque(quantia);
        saldo -= taxa;
    }
}
