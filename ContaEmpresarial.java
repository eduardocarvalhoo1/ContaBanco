// Eduardo Carvalho de Oliveira 2614529
public class ContaEmpresarial extends Conta{

    private Double limtemprestimo;

    public ContaEmpresarial() {
        this.limtemprestimo = 100000.0;
    }

    public Double getLimtemprestimo() {
        return limtemprestimo;
    }

    public void setLimtemprestimo(Double limtemprestimo) {
        this.limtemprestimo = limtemprestimo;
    }

    public void emprestimo (Double quantia) throws EmprestimoException{
        if (quantia <= limtemprestimo){
            saldo += quantia;
        }
        else {
            throw new EmprestimoException();
        }
    }

}
