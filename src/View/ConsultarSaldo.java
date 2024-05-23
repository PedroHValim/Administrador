package View;

import Controller.Controle;
import Model.Administrador;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class ConsultarSaldo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSaldo
     */
    
    Administrador pessoa;
    Controle controle;
    
    /**
     *
     * @param pessoa
     * @param controle
     */
    public ConsultarSaldo(Administrador pessoa ,Controle controle) {
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

        BtConsultarSaldo = new javax.swing.JButton();
        LblExcluirCripto = new javax.swing.JLabel();
        TxtCPFSaldo = new javax.swing.JTextField();
        LblCPFSaldo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaSaldo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ConsultarSaldo");

        BtConsultarSaldo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtConsultarSaldo.setText("Consultar");
        BtConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarSaldoActionPerformed(evt);
            }
        });

        LblExcluirCripto.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LblExcluirCripto.setText("CONSULTAR SALDO");

        TxtCPFSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCPFSaldoActionPerformed(evt);
            }
        });

        LblCPFSaldo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblCPFSaldo.setText("CPF:");

        TxtAreaSaldo.setEditable(false);
        TxtAreaSaldo.setBackground(new java.awt.Color(204, 255, 204));
        TxtAreaSaldo.setColumns(20);
        TxtAreaSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TxtAreaSaldo.setRows(5);
        jScrollPane1.setViewportView(TxtAreaSaldo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblCPFSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCPFSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblExcluirCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblExcluirCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCPFSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCPFSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultarSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCPFSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCPFSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCPFSaldoActionPerformed

    private void BtConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarSaldoActionPerformed
        this.TxtAreaSaldo.setText(controle.ConsultarSaldo(this.TxtCPFSaldo.getText()));
    }//GEN-LAST:event_BtConsultarSaldoActionPerformed

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
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultarSaldo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConsultarSaldo;
    private javax.swing.JLabel LblCPFSaldo;
    private javax.swing.JLabel LblExcluirCripto;
    private javax.swing.JTextArea TxtAreaSaldo;
    private javax.swing.JTextField TxtCPFSaldo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
