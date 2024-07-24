// Eduardo Carvalho de Oliveira 2614529
public class ContaEstudantil extends Conta {

    private String instuicao;
    private double limiteEmprestimoEstudantil = 1500.00;

    public ContaEstudantil(Integer numero, String titular, Double saldo, String instuicao, double limiteEmprestimoEstudantil) {
        super(numero, titular, saldo);
        this.instuicao = instuicao;
        this.limiteEmprestimoEstudantil = limiteEmprestimoEstudantil;
    }

    public String getInstuicao() {
        return instuicao;
    }

    public void setInstuicao(String instuicao) {
        this.instuicao = instuicao;
    }

    public double getLimiteEmprestimoEstudantil() {
        return limiteEmprestimoEstudantil;
    }

    public void setLimiteEmprestimoEstudantil(double limiteEmprestimoEstudantil) {
        this.limiteEmprestimoEstudantil = limiteEmprestimoEstudantil;
    }

    public void aumentarLimite(double quantidade){
        this.limiteEmprestimoEstudantil += quantidade;
    }
}
