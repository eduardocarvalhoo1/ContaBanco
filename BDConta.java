// Eduardo Carvalho de Oliveira 2614529
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BDConta {
    private Conta c;
    private List <Poupanca> bd;
    private static BDConta ccUnic;

    BDConta(){
        bd = new ArrayList<>();
    }
    
    public List<Poupanca> getBd() {
        return bd;
    }
    
    public Poupanca cadConta(Poupanca c) {
    // Verifica se a conta já existe
    if (consConta(c) == null) {
        bd.add(c); 
        return c;   
    } else {
        return null;  
    }
}

    public Poupanca consConta (Poupanca c){
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getNumero() == c.getNumero()) { // Compara o número da conta
                return bd.get(i); // Retorna a conta encontrada
            }
        }
        return null;
    }

    public Poupanca exclConta (Poupanca c){
        Poupanca c1 = consConta(c);
        if (c1 != null){
            bd.remove(c1);
            return null;
        }
        else {
            return c;
        }
    }

    public Poupanca atualizarTitular(Poupanca c){
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
