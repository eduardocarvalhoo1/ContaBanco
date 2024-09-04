
// Eduardo Carvalho de Oliveira 2614529
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BDEstudantil {
    private ContaEstudantil c;
    private List <ContaEstudantil> bd;
    private static BDEstudantil ccUnic;

    BDEstudantil(){
        bd = new ArrayList<>();
    }  
    
    public List<ContaEstudantil> getBd() {
        return bd;
    }
    
    public ContaEstudantil cadConta(ContaEstudantil c) {
    // Verifica se a conta já existe
    if (consConta(c) == null) {
        bd.add(c); 
        return c;   
    } else {
        return null;  
    }
}

    public ContaEstudantil consConta (ContaEstudantil c){
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getNumero() == c.getNumero()) { // Compara o número da conta
                return bd.get(i); // Retorna a conta encontrada
            }
        }
        return null;
    }

    public ContaEstudantil exclConta (ContaEstudantil c){
        ContaEstudantil c1 = consConta(c);
        if (c1 != null){
            bd.remove(c1);
            return null;
        }
        else {
            return c;
        }
    }

    public ContaEstudantil atualizarTitular(ContaEstudantil c){
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getNumero() == c.getNumero()) {
                c = bd.get(i);
                String titular = JOptionPane.showInputDialog(null, "Informe o novo nome do titular", "Atualizar Nome", JOptionPane.QUESTION_MESSAGE);
                c.setTitular(titular);
                bd.set(i, c);
                return bd.get(i);
            }
        }
        return null;
    }
}

