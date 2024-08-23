// Eduardo Carvalho de Oliveira 2614529
public class ContaEstudantil extends Conta {

    private String instuicao;
    private Double limiteEmprestimoEstudantil = 15000.00;

    public ContaEstudantil() {
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

    public void setLimiteEmprestimoEstudantil(Double limiteEmprestimoEstudantil) {
        this.limiteEmprestimoEstudantil = limiteEmprestimoEstudantil;
    }

    public void aumentarLimite(Double aumento){
        this.limiteEmprestimoEstudantil += aumento;
    }
}
