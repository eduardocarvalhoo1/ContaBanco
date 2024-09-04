// Eduardo Carvalho de Oliveira 2614529
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BDEmpresarial {
    private Conta c;
    private List <ContaEmpresarial> bd;
    private static BDEmpresarial ccUnic;

    BDEmpresarial(){
        bd = new ArrayList<>();
    }
    
    
    public List<ContaEmpresarial> getBd() {
        return bd;
    }
    
    public ContaEmpresarial cadConta(ContaEmpresarial c) {
    // Verifica se a conta já existe
    if (consConta(c) == null) {
        bd.add(c); 
        return c;   
    } else {
        return null;  
    }
}

    public ContaEmpresarial consConta (ContaEmpresarial c){
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getNumero() == c.getNumero()) { // Compara o número da conta
                return bd.get(i); // Retorna a conta encontrada
            }
        }
        return null;
    }

    public ContaEmpresarial exclConta (ContaEmpresarial c){
        ContaEmpresarial c1 = consConta(c);
        if (c1 != null){
            bd.remove(c1);
            return null;
        }
        else {
            return c;
        }
    }

    public ContaEmpresarial atualizarTitular(ContaEmpresarial c){
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
