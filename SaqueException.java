// Eduardo Carvalho de Oliveira 2614529
import javax.swing.JOptionPane;

public class SaqueException extends Exception {
    public void limtSaque (){
        JOptionPane.showMessageDialog(null, "O valor do saque é superior ao do saldo da conta.", "Entrada Inválida", 0);
    }
}
