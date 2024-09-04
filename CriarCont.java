// NetBeans 22
// Eduardo Carvalho de Oliveira 2614529
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CriarCont extends javax.swing.JFrame {
    
    private Poupanca conta;
    private BDConta gerConta = new BDConta();
    private static CriarCont ccUnic;
   
    
    private CriarCont() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static CriarCont getCriarCont(){
        if(ccUnic == null){
            ccUnic = new CriarCont();
        }
        return ccUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumCont = new javax.swing.JLabel();
        ctNumCont = new javax.swing.JTextField();
        lblTitular = new javax.swing.JLabel();
        ctTitular = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        lblSaldoI = new javax.swing.JLabel();
        CtSaldoI = new javax.swing.JTextField();
        CtDeposito = new javax.swing.JTextField();
        lblDeposito = new javax.swing.JLabel();
        lblSaque = new javax.swing.JLabel();
        CtSaque = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConta = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contas");

        lblNumCont.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumCont.setText("Número da conta: ");

        ctNumCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNumContActionPerformed(evt);
            }
        });

        lblTitular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitular.setText("Titular: ");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblSaldoI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaldoI.setText("Saldo Inicial: ");

        CtSaldoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtSaldoIActionPerformed(evt);
            }
        });

        CtDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtDepositoActionPerformed(evt);
            }
        });

        lblDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDeposito.setText("Valor do deposito:");

        lblSaque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaque.setText("Valor do saque:");

        CtSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtSaqueActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar conta pelo número da conta");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número da Conta", "Titular", "Saldo", "Saldo com juros"
            }
        ));
        jScrollPane1.setViewportView(tblConta);

        btAlterar.setText("Alterar nome do titular");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir conta");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btSair))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNumCont)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctNumCont, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSaldoI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CtSaldoI, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CtDeposito)
                                        .addGap(112, 112, 112))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSaque)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCont)
                    .addComponent(ctNumCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular)
                    .addComponent(ctTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoI)
                    .addComponent(CtSaldoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeposito)
                    .addComponent(CtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaque))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpar();
    }//GEN-LAST:event_btLimparActionPerformed
    
    public void limpar(){
         ctNumCont.setText("");
        CtDeposito.setText("");
        CtSaldoI.setText("");
        ctTitular.setText("");
        CtSaque.setText("");
        ctNumCont.requestFocus();
    }
    
    private void CtDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtDepositoActionPerformed
        
    }//GEN-LAST:event_CtDepositoActionPerformed

    private void CtSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtSaqueActionPerformed
        
    }//GEN-LAST:event_CtSaqueActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

            cadastrarConta();
            listar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listar();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void ctNumContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNumContActionPerformed
        
    }//GEN-LAST:event_ctNumContActionPerformed

    private void CtSaldoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtSaldoIActionPerformed
        
    }//GEN-LAST:event_CtSaldoIActionPerformed
    
    public void excluir(){
        conta = new Poupanca();
        
        try{
            conta.setNumero(Integer.parseInt(ctNumCont.getText()));
            conta = gerConta.consConta(conta);
            
            if(conta != null){
                ctNumCont.setText(Integer.toString(conta.getNumero()));
                ctTitular.setText(conta.getTitular());
                CtSaldoI.setText(Double.toString(conta.getSaldo()));
                int confirm = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir essa conta?", "Confirmação de exclusão", 1);
                if (confirm == 0){
                    gerConta.exclConta(conta);
                    JOptionPane.showMessageDialog(null, "Conta excluída com sucesso", "Sucesso", 1);
                    limpar();
                }
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Conta não encontrada, verifique o número", "Erro", 0);
                limpar();
            }
        }
        catch (NumPeqException e) {
            e.erroPeq();
        }
        catch(NumGrdException e){
            e.erro();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void alterar(){
        conta = new Poupanca();
        
        try{
            conta.setNumero(Integer.parseInt(ctNumCont.getText()));
            conta = gerConta.atualizarTitular(conta);
            
            if(conta != null){
                ctNumCont.setText(Integer.toString(conta.getNumero()));
                ctTitular.setText(conta.getTitular());
                CtSaldoI.setText(Double.toString(conta.getSaldo()));
                JOptionPane.showMessageDialog(null, "O nome do Titular foi atualizado com sucesso", "Sucesso", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Conta não encontrada, verifique o número", "Erro", 0);
                limpar();
            }
        }
        catch (NumPeqException e) {
            e.erroPeq();
        }
        catch(NumGrdException e){
            e.erro();
        }
        catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            ctNumCont.setText("");
            ctNumCont.requestFocus();
        }
        
    }
    
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel)tblConta.getModel();
        int linha = 0;
        
        modelo.setRowCount(linha);
        
        for(Poupanca c : gerConta.getBd()){
            
            modelo.insertRow(linha, new Object [] {c.getNumero(), c.getTitular(), c.getSaldo(), c.getSaldoAtualizado()});
            linha++;
        }
    }
    
    public void consultar(){
        conta = new Poupanca();
        
        try{
            conta.setNumero(Integer.parseInt(ctNumCont.getText()));
            conta = gerConta.consConta(conta);
            
            if(conta != null){
                ctNumCont.setText(Integer.toString(conta.getNumero()));
                ctTitular.setText(conta.getTitular());
                CtSaldoI.setText(Double.toString(conta.getSaldo()));
                JOptionPane.showMessageDialog(null, "Confirme os dados da conta", null, 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Conta não encontrada, verifique o número", "Erro", 0);
                limpar();
            }
        }
        catch (NumPeqException e) {
            e.erroPeq();
        }
        catch(NumGrdException e){
            e.erro();
        }
        catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            ctNumCont.setText("");
            ctNumCont.requestFocus();
        }
    }
    
    public void cadastrarConta(){
        conta = new Poupanca();
        try{
            conta.setNumero(Integer.parseInt(ctNumCont.getText()));
            conta.setTitular(ctTitular.getText());
            double saldoInicial = Double.parseDouble(CtSaldoI.getText());
            conta.setSaldo(saldoInicial);
            double deposito = Double.parseDouble(CtDeposito.getText());
            conta.deposito(deposito);
            double saque = Double.parseDouble(CtSaque.getText());
            conta.saque(saque);
        
            //double saldoFinal = saldoInicial + deposito - saque;
            //conta.setSaldo(saldoFinal);
            conta = gerConta.cadConta(conta);
            
            if(conta != null){
                JOptionPane.showMessageDialog(null, "Conta criada com sucesso!", "Sucesso", 1);
                limpar();
            }
            else{
                JOptionPane.showMessageDialog(null, "O número da conta já pertence a uma conta existente", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            ctNumCont.setText("");
            ctNumCont.requestFocus();
        }
        catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "O número da conta deve ser um número inteiro", "Entrada inválida", 0);
                    ctNumCont.setText("");
                    ctNumCont.requestFocus();
        }
        catch (NumPeqException e) {
            e.erroPeq();
            ctNumCont.setText("");
            ctNumCont.requestFocus();
        }
        catch(NumGrdException e){
            e.erro();
            ctNumCont.setText("");
            ctNumCont.requestFocus();
        } 
        catch (SaqueException e) {
            e.limtSaque();
        }
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarCont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CtDeposito;
    private javax.swing.JTextField CtSaldoI;
    private javax.swing.JTextField CtSaque;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctNumCont;
    private javax.swing.JTextField ctTitular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeposito;
    private javax.swing.JLabel lblNumCont;
    private javax.swing.JLabel lblSaldoI;
    private javax.swing.JLabel lblSaque;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JTable tblConta;
    // End of variables declaration//GEN-END:variables
}
