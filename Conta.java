// Eduardo Carvalho de Oliveira 2614529
public class Conta implements IOperacaoBancaria {

    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta() {
        this.numero = 0;
        this.titular = "";
        this.saldo = 0.0;
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
            if(numero < 999999){
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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Sobrescrita
    public void saque(Double quantia) throws SaqueException{
        if (quantia > saldo){
            throw new SaqueException();
        }
            saldo -= quantia;
    }

    // Sobrescrita
    public void deposito(Double quantia){
        saldo += quantia;
    }

}
