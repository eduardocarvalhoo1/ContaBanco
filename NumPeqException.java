// Eduardo Carvalho de Oliveira 2614529
import javax.swing.JOptionPane;

public class NumPeqException extends Exception{
    public void erroPeq(){
       JOptionPane.showMessageDialog(null, "O número deve ser maior que 0.", "Entrada Inválida", 0);
    }
}
