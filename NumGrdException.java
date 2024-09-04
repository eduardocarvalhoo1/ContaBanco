// Eduardo Carvalho de Oliveira 2614529
import javax.swing.JOptionPane;

public class NumGrdException extends Exception{
    public void erro (){
        JOptionPane.showMessageDialog(null, "Número digitado é maior que 6 dígitos.", "Entrada Inválida", 0);
    }
}
