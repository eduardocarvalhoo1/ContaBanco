// Eduardo Carvalho de Oliveira 2614529
public class Conta {

    private Integer numero;
    private String titular;
    protected Double saldo = 0.0;

    public Conta() {

    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) throws NumGrdException, NumPeqException {
        if(numero > 0){
            if(numero < 100000){
                this.numero = numero;
            }
            else{
                throw new NumGrdException();
            }
        }
        else if (numero < 0){
            throw new NumPeqException();
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void saque(double quantia) throws  SaqueException{
        if (quantia > saldo){
            throw new SaqueException();
        }
        else {
            saldo -= quantia;
        }
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    @Override
    public String toString() {
        return "Conta " +
                numero +
                ", Titular: " + titular +
                ", Saldo: R$" +
                String.format("%.2f", saldo);
    }
}
