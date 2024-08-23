// Eduardo Carvalho de Oliveira 2614529
public class Poupanca extends Conta{

    private Double juros = 0.02;

    public Poupanca() {

    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void saldoAtualizado(){
        saldo += saldo * juros;
    }
}
