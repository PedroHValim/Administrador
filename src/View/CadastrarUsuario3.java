package View;

import Controller.Controle;
import Model.Administrador;
import java.sql.SQLException;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class CadastrarUsuario3 extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarUsuario
     */
    Administrador pessoa;
    Controle controle;
    
    /**
     *
     * @param pessoa
     * @param controle
     */
    public CadastrarUsuario3(Administrador pessoa,Controle controle) {
        initComponents();
        this.pessoa = pessoa;
        this.controle = controle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        LblCadastrarUsu = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        TxtCPF = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        BtCadastrar = new javax.swing.JButton();
        LblBitcoin = new javax.swing.JLabel();
        TxtEthe = new javax.swing.JTextField();
        LblEthe = new javax.swing.JLabel();
        TxtReais = new javax.swing.JTextField();
        LblReais = new javax.swing.JLabel();
        TxtBitcoin = new javax.swing.JTextField();
        TxtRip = new javax.swing.JTextField();
        LblRip = new javax.swing.JLabel();
        LblCadastrarUsu1 = new javax.swing.JLabel();
        TxtMoeda1 = new javax.swing.JTextField();
        LblEthe1 = new javax.swing.JLabel();
        TxtMoeda2 = new javax.swing.JTextField();
        LblRip1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastrarUsuario");

        LblCadastrarUsu.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LblCadastrarUsu.setText("CADASTRAR USUÁRIO");

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNome.setText("Nome:");

        TxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCPFActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCpf.setText("CPF:");

        TxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSenha.setText("Senha:");

        BtCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        LblBitcoin.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblBitcoin.setText("Bitcoin:");

        TxtEthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEtheActionPerformed(evt);
            }
        });

        LblEthe.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblEthe.setText("Ethereum:");

        TxtReais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtReaisActionPerformed(evt);
            }
        });

        LblReais.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblReais.setText("Reais:");

        TxtBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBitcoinActionPerformed(evt);
            }
        });

        TxtRip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRipActionPerformed(evt);
            }
        });

        LblRip.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblRip.setText("Ripple:");

        LblCadastrarUsu1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LblCadastrarUsu1.setText("SALDO");

        TxtMoeda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMoeda1ActionPerformed(evt);
            }
        });

        LblEthe1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblEthe1.setText("Moeda1:");

        TxtMoeda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMoeda2ActionPerformed(evt);
            }
        });

        LblRip1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblRip1.setText("Moeda2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(LblCadastrarUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEthe1)
                    .addComponent(LblRip1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblReais, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblEthe)
                                .addComponent(LblRip))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtRip, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtReais, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblCadastrarUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtMoeda1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtMoeda2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(BtCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblCadastrarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(LblCadastrarUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblReais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblEthe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEthe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblRip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEthe1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMoeda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRip1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMoeda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BtCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void TxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCPFActionPerformed

    private void TxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaActionPerformed

    private void TxtEtheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEtheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEtheActionPerformed

    private void TxtReaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtReaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtReaisActionPerformed

    private void TxtBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBitcoinActionPerformed

    private void TxtRipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRipActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
        String nome = this.TxtNome.getText();
        String cpf = this.TxtCPF.getText();
        String senha = this.TxtSenha.getText();
        double reais = Double.parseDouble(this.TxtReais.getText());
        double btc = Double.parseDouble(this.TxtBitcoin.getText());
        double ethe = Double.parseDouble(this.TxtEthe.getText());
        double rip = Double.parseDouble(this.TxtRip.getText());
        double moeda1 = Double.parseDouble(this.TxtMoeda1.getText());
        double moeda2 = Double.parseDouble(this.TxtMoeda2.getText());
        
        try {
            controle.InserirUsuario(nome, cpf, senha, reais, btc, ethe, rip,moeda1,moeda2);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void TxtMoeda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMoeda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMoeda1ActionPerformed

    private void TxtMoeda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMoeda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMoeda2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastrarUsuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JLabel LblBitcoin;
    private javax.swing.JLabel LblCadastrarUsu;
    private javax.swing.JLabel LblCadastrarUsu1;
    private javax.swing.JLabel LblEthe;
    private javax.swing.JLabel LblEthe1;
    private javax.swing.JLabel LblReais;
    private javax.swing.JLabel LblRip;
    private javax.swing.JLabel LblRip1;
    private javax.swing.JTextField TxtBitcoin;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField TxtEthe;
    private javax.swing.JTextField TxtMoeda1;
    private javax.swing.JTextField TxtMoeda2;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtReais;
    private javax.swing.JTextField TxtRip;
    private javax.swing.JTextField TxtSenha;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
