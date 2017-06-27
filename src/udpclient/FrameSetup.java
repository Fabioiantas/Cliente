/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class FrameSetup extends javax.swing.JFrame {
    
    EmailSetup setup = new EmailSetup();
    
    public FrameSetup(EmailSetup setup) {
        initComponents();
        this.setup = setup;
        Config();
        //SetSetup();
    }
    
    public void Config(){
        TextEmail.setText("distribuidos.ads@gmail.com");
        TextPwdEmail.setText("2017sistemas");
        TextIpSmtp.setText("smtp.gmail.com");
        TextIpImap.setText("imap.gmail.com");
        TextPortSmtp.setText(Integer.toString(587));
        TextPortImap.setText(Integer.toString(993));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServerGroup = new javax.swing.ButtonGroup();
        TextEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextPwdEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextIpSmtp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextIpImap = new javax.swing.JTextField();
        TextPortSmtp = new javax.swing.JTextField();
        TextPortImap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        RdLocal = new javax.swing.JRadioButton();
        RdGmail = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TextEmail.setText("distribuidos.ads@gmail.com");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Configurações de E-mail");

        TextPwdEmail.setText("2017sistemas");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        jLabel4.setText("IP SMTP");

        TextIpSmtp.setText("smtp.gmail.com");

        jLabel5.setText("IP IMAP");

        TextIpImap.setText("imap.gmail.com");

        TextPortSmtp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextPortSmtp.setText("587");

        TextPortImap.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextPortImap.setText("993");

        jLabel6.setText("Port SMTP");

        jLabel7.setText("Port IMAP");

        jLabel8.setText("===>");

        jLabel9.setText("===>");

        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        ServerGroup.add(RdLocal);
        RdLocal.setSelected(true);
        RdLocal.setText("Local Server");

        ServerGroup.add(RdGmail);
        RdGmail.setText("Gmail Server");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextIpImap, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextIpSmtp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextPwdEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(BtSalvar)
                            .addComponent(jLabel3)
                            .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdGmail)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextPortSmtp)
                                .addComponent(TextPortImap))
                            .addComponent(RdLocal))))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RdLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RdGmail))
                .addGap(2, 2, 2)
                .addComponent(TextPwdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextIpSmtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPortSmtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextIpImap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPortImap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BtSalvar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void SetSetup(){
        if(!"".equals(setup.getEmail()) || setup.getEmail() != null){
            TextEmail.setText(setup.getEmail());
            TextPwdEmail.setText(setup.getSenha());
            TextIpSmtp.setText(setup.getIp_smtp());
            TextIpImap.setText(setup.getIp_imap());
            TextPortSmtp.setText(Integer.toString(setup.getSmtp_port()));
            TextPortImap.setText(Integer.toString(setup.getImap_port()));
            if("L".equals(setup.getTipo()))
                RdLocal.setSelected(true);
            else if ("G".equals(setup.getTipo()))
                RdGmail.setSelected(true);
        }    
    }
    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        setup.setEmail(TextEmail.getText().trim());
        setup.setSenha(TextPwdEmail.getText().trim());
        setup.setIp_smtp(TextIpSmtp.getText().trim());
        setup.setIp_imap(TextIpImap.getText().trim());
        setup.setSmtp_port(Integer.parseInt(TextPortSmtp.getText().trim()));
        setup.setImap_port(Integer.parseInt(TextPortImap.getText().trim()));
        if (RdLocal.isSelected())
            setup.setTipo("L");
        else if(RdGmail.isSelected())
            setup.setTipo("G");
        JOptionPane.showMessageDialog(null, "Salvo!");
        this.dispose();
        
    }//GEN-LAST:event_BtSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSetup(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSalvar;
    private javax.swing.JRadioButton RdGmail;
    private javax.swing.JRadioButton RdLocal;
    private javax.swing.ButtonGroup ServerGroup;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextIpImap;
    private javax.swing.JTextField TextIpSmtp;
    private javax.swing.JTextField TextPortImap;
    private javax.swing.JTextField TextPortSmtp;
    private javax.swing.JTextField TextPwdEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
