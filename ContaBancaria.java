public interface ContaBancaria {
    void deposito(Double quantia);
    void saque(Double quantia) throws SaqueException;
    Double getSaldo();
    void setSaldo(Double saldo);
    String toString();
}
