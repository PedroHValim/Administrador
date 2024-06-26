package View;

import Controller.Controle;
import Model.Administrador;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class ConsultarExtrato extends javax.swing.JFrame {

       Administrador pessoa;
       Controle controle;
    
    /**
     *
     * @param controle
     * @param pessoa
     */
    public ConsultarExtrato(Controle controle , Administrador pessoa ) {
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

        LblCPFExtraro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaExtrato = new javax.swing.JTextArea();
        BtConsultarExtrato = new javax.swing.JButton();
        LblConsultarExtrato = new javax.swing.JLabel();
        TxtCPFExtrato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ConsultarExtrato");

        LblCPFExtraro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblCPFExtraro.setText("CPF:");

        TxtAreaExtrato.setEditable(false);
        TxtAreaExtrato.setColumns(20);
        TxtAreaExtrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TxtAreaExtrato.setRows(5);
        jScrollPane1.setViewportView(TxtAreaExtrato);

        BtConsultarExtrato.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtConsultarExtrato.setText("Consultar");
        BtConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarExtratoActionPerformed(evt);
            }
        });

        LblConsultarExtrato.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LblConsultarExtrato.setText("CONSULTAR EXTRATO");

        TxtCPFExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCPFExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(LblCPFExtraro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtCPFExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtConsultarExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCPFExtraro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCPFExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultarExtrato))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarExtratoActionPerformed
        try{
            this.TxtAreaExtrato.setText(controle.ConsultarExtrato(this.TxtCPFExtrato.getText()));
        }catch(SQLException e){
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "ERRO!!");
    }
    }//GEN-LAST:event_BtConsultarExtratoActionPerformed

    private void TxtCPFExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCPFExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCPFExtratoActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ConsultarExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConsultarExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConsultarExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConsultarExtrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultarExtrato().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConsultarExtrato;
    private javax.swing.JLabel LblCPFExtraro;
    private javax.swing.JLabel LblConsultarExtrato;
    public javax.swing.JTextArea TxtAreaExtrato;
    public javax.swing.JTextField TxtCPFExtrato;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
