// Eduardo Carvalho de Oliveira 2614529
import javax.swing.JOptionPane;

public class EmprestimoException extends Exception{
    public void limtEmprestimo (){
        JOptionPane.showMessageDialog(null, "O valor solicitado está acima do limite de empréstimo.", "Entrada Inválida", 0);
    }
}
