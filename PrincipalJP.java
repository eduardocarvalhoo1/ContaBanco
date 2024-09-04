// NetBeans 22
// Eduardo Carvalho de Oliveira 2614529
import javax.swing.JOptionPane;

public class PrincipalJP extends javax.swing.JFrame {

    public PrincipalJP() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        MnBarPrinc = new javax.swing.JMenuBar();
        crConta = new javax.swing.JMenu();
        mnCrContaEm = new javax.swing.JMenuItem();
        mnCrContaE = new javax.swing.JMenuItem();
        mnCrContaP = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mnFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Bem-vindo ao banco UTFDS");

        crConta.setText("Criar conta");

        mnCrContaEm.setText("Conta Empresarial...");
        mnCrContaEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCrContaEmActionPerformed(evt);
            }
        });
        crConta.add(mnCrContaEm);

        mnCrContaE.setText("Conta Estudantil...");
        mnCrContaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCrContaEActionPerformed(evt);
            }
        });
        crConta.add(mnCrContaE);

        mnCrContaP.setText("Conta Poupança...");
        mnCrContaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCrContaPActionPerformed(evt);
            }
        });
        crConta.add(mnCrContaP);

        MnBarPrinc.add(crConta);

        mnSair.setText("Sair");

        mnFechar.setText("Sair");
        mnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFecharActionPerformed(evt);
            }
        });
        mnSair.add(mnFechar);

        MnBarPrinc.add(mnSair);

        setJMenuBar(MnBarPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lblTitulo)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCrContaEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCrContaEmActionPerformed
        CriarEmpresarial.getCriarEmpresarial().setVisible(true);
    }//GEN-LAST:event_mnCrContaEmActionPerformed

    private void mnCrContaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCrContaEActionPerformed
        CriarEstudantil.getCriarEstudantil().setVisible(true);
    }//GEN-LAST:event_mnCrContaEActionPerformed

    private void mnCrContaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCrContaPActionPerformed
        CriarCont.getCriarCont().setVisible(true);
    }//GEN-LAST:event_mnCrContaPActionPerformed

    private void mnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFecharActionPerformed
        sair();
    }//GEN-LAST:event_mnFecharActionPerformed
    
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MnBarPrinc;
    private javax.swing.JMenu crConta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnCrContaE;
    private javax.swing.JMenuItem mnCrContaEm;
    private javax.swing.JMenuItem mnCrContaP;
    private javax.swing.JMenuItem mnFechar;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
