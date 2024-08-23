// Eduardo Carvalho de Oliveira 2614529
public interface IOperacaoBancaria {
    void deposito(Double valor);
    void saque(Double valor) throws SaqueException;
}
