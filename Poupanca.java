// Eduardo Carvalho de Oliveira 2614529
public class Poupanca extends Conta{

    private Double juros = 0.02;

    public Poupanca() {
        super();
    }

    public Poupanca(Integer numero, String titular, Double saldo, Double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void saldoatualizado(){
        saldo += saldo * juros;
    }

    // Sobrescrita
    @Override
    public final void saque(Double quantia){
        saldo -= quantia;
    }
}
