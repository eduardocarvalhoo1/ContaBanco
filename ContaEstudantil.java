// Eduardo Carvalho de Oliveira 2614529
public class ContaEstudantil extends Conta {

    private String instuicao;
    private double limiteEmprestimoEstudantil = 15000.00;

    public ContaEstudantil() {
    }

   /* public ContaEstudantil(Integer numero, String titular, Double saldo, String instuicao, double limiteEmprestimoEstudantil) {
        super(numero, titular, saldo);
        this.instuicao = instuicao;
        this.limiteEmprestimoEstudantil = limiteEmprestimoEstudantil;
    }*/

    public String getInstuicao() {
        return instuicao;
    }

    public void setInstuicao(String instuicao) {
        this.instuicao = instuicao;
    }

    public double getLimiteEmprestimoEstudantil() {
        return limiteEmprestimoEstudantil;
    }

    public void setLimiteEmprestimoEstudantil(Double limiteEmprestimoEstudantil) {
        this.limiteEmprestimoEstudantil = limiteEmprestimoEstudantil;
    }

    public void aumentarLimite(Double aumento){
        this.limiteEmprestimoEstudantil += aumento;
    }
}
