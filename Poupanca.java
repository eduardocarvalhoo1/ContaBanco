// Eduardo Carvalho de Oliveira 2614529
public class Poupanca extends Conta{

    private Double juros;

    public Poupanca() {
        this.juros = 0.02;
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
