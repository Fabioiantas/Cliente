/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import email.CaixaEntrada;
import java.awt.Color;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
@SuppressWarnings("unchecked")
/*
 *
 * @author fabio.iantas
 */
public class FrameClient extends javax.swing.JFrame{
    boolean connection = false;
    ClientConnect c;
   // Object[][] userlista = null;
    Thread cliente;
    FrameClient frame;
    SendMessage send;
    SendTo sendTo = new SendTo();
    int cont1 = 0;
    int cont2 = 0;
    Server server = new Server();
    LocalUser localclient = new LocalUser();
    EmailSetup emailSetup;
    
    public FrameClient() {
        send = new SendMessage();
        SetConnection(false);
        initComponents();
        TextStatus.setText("OFFLINE");
        emailSetup = new EmailSetup();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextPort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextIp = new javax.swing.JTextField();
        BtLogin = new javax.swing.JButton();
        BtLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        TextStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TextPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDebug = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUser = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        textChat = new javax.swing.JTextArea();
        BtSend = new javax.swing.JToggleButton();
        TextMsg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Connection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Port:");

        TextPort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextPort.setText("12345");
        TextPort.setToolTipText("Informe a porta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("IP:");

        TextIp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextIp.setText("localhost");

        BtLogin.setText("Login");
        BtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLoginActionPerformed(evt);
            }
        });

        BtLogout.setText("Logout");
        BtLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLogoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("User:");

        TextStatus.setEditable(false);
        TextStatus.setBackground(new java.awt.Color(255, 51, 51));
        TextStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextStatus.setToolTipText("");

        jButton1.setText("E-mail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Senha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(TextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextIp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPort, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BtLogin)
                .addComponent(TextPort)
                .addComponent(jLabel1)
                .addComponent(TextIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(TextUser)
                .addComponent(jLabel4)
                .addComponent(TextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BtLogout)
                .addComponent(jButton1)
                .addComponent(TextPassword)
                .addComponent(jLabel7))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Debug", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(32780, 32767));
        jPanel3.setPreferredSize(new java.awt.Dimension(190, 183));

        TextDebug.setBackground(java.awt.SystemColor.menu);
        TextDebug.setColumns(20);
        TextDebug.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TextDebug.setRows(5);
        jScrollPane1.setViewportView(TextDebug);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("CLIENT");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Online", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        TableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Ip", "Port"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableUser);
        if (TableUser.getColumnModel().getColumnCount() > 0) {
            TableUser.getColumnModel().getColumn(0).setResizable(false);
            TableUser.getColumnModel().getColumn(1).setResizable(false);
            TableUser.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        textChat.setColumns(20);
        textChat.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textChat.setRows(5);
        jScrollPane3.setViewportView(textChat);

        BtSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtSend.setText("Enviar");
        BtSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSendActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Chat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Message");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TextMsg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtSend))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(518, 618, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextMsg))
                            .addComponent(BtSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("E-mail");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Setup");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void SetEmailSetup(String email, String senha, String ipSmtp, String ipimap, int portSmtp, int portImap){
        
        emailSetup.setEmail(email);
        emailSetup.setSenha(senha);
        emailSetup.setIp_smtp(ipSmtp);
        emailSetup.setIp_imap(ipimap);
        emailSetup.setSmtp_port(portSmtp);
        emailSetup.setImap_port(portImap);
    }

    public String GetIp(){
        return TextIp.getText().trim();
    }
    public Integer GetPort(){
        return Integer.parseInt(TextPort.getText().trim());
    }
    public JTextField getTextIp() {
        return TextIp;
    }

    public void setTextIp(JTextField TextIp) {
        this.TextIp = TextIp;
    }

    public JTextField getTextPort() {
        return TextPort;
    }

    public void setTextPort(JTextField TextPort) {
        this.TextPort = TextPort;
    }
    
    public EmailSetup GetEmailSetup (){
        return emailSetup;
    }
    
    public void Enviar(String de, String conteudo){
        try {
            send.Send("6#"+de+"#"+conteudo, TextIp.getText().trim(), Integer.parseInt(TextPort.getText().trim()), this);
            } catch (IOException ex) {
                Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void SetDebug(String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dateForrmat = sdf.format(hora);
        TextDebug.setText(TextDebug.getText()+"\n"+dateForrmat+":"+msg);
    }
    public String ReturnData(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dateForrmat = sdf.format(hora);
        return dateForrmat;
    }
    
    private void BtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLoginActionPerformed
        Integer confirmation;
        String resposta;
        SetDebug("action=login / MessagetoSever: 1#"+TextUser.getText().trim()+"#"+TextPassword.getText().trim());
        if(!connection){
            try {
                server.setIp(TextIp.getText());
                server.setPort(Integer.parseInt(TextPort.getText()));
                localclient.setLocalUser(TextUser.getText());
                send.Send("1#"+TextUser.getText().trim()+"#"+TextPassword.getText(), TextIp.getText().trim(), Integer.parseInt(TextPort.getText().trim()), this);
                System.out.println("Client Send>"+cont1+": "+"1#"+TextUser.getText().trim());
                cont1++;
            } catch (IOException ex) {
                Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            SetDebug("Usuário logado");
        }
    }//GEN-LAST:event_BtLoginActionPerformed

    private void BtLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLogoutActionPerformed
        Integer confirmation;
        String resposta;
        SetDebug("action=logout / MessageToServer: "+"5#");
        if(connection){
            try {
                SetStatus(false);
                CleanTable();
                //resposta = c.startConnection("5#", TextIp.getText().trim(), Integer.parseInt(TextPort.getText().trim()), this);
                send.Send("5#", TextIp.getText().trim(), Integer.parseInt(TextPort.getText().trim()), this);
                System.out.println("client send>"+cont2+": "+"5#");
                new ListennerServer(null, this).setIsActive(false);
                cont2++;
               // this.dispose();
            }catch (IOException ex) {
                SetDebug(ex.getMessage());
            }   
        }else{
           System.out.println("Not Connected!");
        }
    }//GEN-LAST:event_BtLogoutActionPerformed

    private void BtSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSendActionPerformed
        DefaultTableModel tabela = (DefaultTableModel)TableUser.getModel();
        try {
            if(sendTo.getIp() != null && sendTo.getPort() != null){
                if (!"999.999.999.999".equals(sendTo.getIp())){
                    //frame.SetDebug("action=DirectMessage / MessageToServer: "+"3#"+sendTo.getIp()+"#"+sendTo.getPort().toString()+"#"+TextMsg.getText());
                    SetChat(null, null, TextMsg.getText().trim());
                }else
                    SetDebug("action=BroadcastMessage / MessageToServer: "+"3#"+sendTo.getIp()+"#"+sendTo.getPort().toString()+"#"+TextMsg.getText());
                send.Send("3#"+sendTo.getIp()+"#"+sendTo.getPort().toString()+"#"+TextMsg.getText()
                         ,server.getIp()
                         ,server.getPort()
                         ,this);
            }else
                JOptionPane.showMessageDialog(null, "Selecione o Destino!");
        } catch (IOException ex) {
            Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtSendActionPerformed
    
    private void TableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUserMouseClicked
        if(TableUser.getRowCount() > 0){
            if(!"Todos".equals(TableUser.getValueAt(TableUser.getSelectedRow(), 0).toString())){
                sendTo.setIp(TableUser.getValueAt(TableUser.getSelectedRow(), 1).toString());
                sendTo.setPort(Integer.parseInt(TableUser.getValueAt(TableUser.getSelectedRow(), 2).toString()));
                sendTo.setUser(TableUser.getValueAt(TableUser.getSelectedRow(), 0).toString());
            }else{
                sendTo.setIp("999.999.999.999");
                sendTo.setPort(99999);
                sendTo.setUser("todos");
            }
        }
    }//GEN-LAST:event_TableUserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (getStatus()){
            try { 
                CaixaEntrada caixa = new CaixaEntrada(emailSetup,this);
                caixa.setVisible(true);
            } catch (MessagingException ex) {
                Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(FrameClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
            JOptionPane.showMessageDialog(null, "Cliente OFFLINE!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrameSetup setup =  new FrameSetup(emailSetup);
        setup.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    public void AddRow (String msg){
        if(msg != null){
            try{
                String[] lista = msg.trim().substring(2).split("#");
                DefaultTableModel listaClientes = (DefaultTableModel)TableUser.getModel();
                listaClientes.setNumRows(0);
                if(lista.length > 2)
                    listaClientes.addRow(new String[]{"Todos","",""});
                for(int i = 0; i<lista.length; i++){
                    String ip    = lista[i];
                    String porta = lista[++i];
                    String user  = lista[++i];
                    if(!TextUser.getText().equals(user.trim())){
                        listaClientes.addRow(new String[]{user,ip,porta});       
                    }
                }
                TableUser.setModel(listaClientes);
            }catch(Exception ex){
                System.err.println(ex);
            }
        }
    }
    
    public void SetConnection(boolean connection){
        this.connection = connection;
    }
    public void CleanTable(){
        DefaultTableModel model = (DefaultTableModel)TableUser.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
        }
        TableUser.setModel(model);
    }
    
    public Boolean getStatus(){
        Boolean status = false;
        if("ONLINE".equals(TextStatus.getText())){
            status = true;
            System.out.println("ONLINE");
        }
        return status;
    }
    public void SetStatus(boolean status){
        if(!status){
            TextStatus.setBackground(Color.red);
            TextStatus.setText("OFFLINE");
            SetConnection(status);
        }else{
            TextStatus.setBackground(Color.green);
            TextStatus.setText("ONLINE");
            SetConnection(status);
        }
    }
    public String ReturnUser(String ip, String port){
        String user = null;
        System.out.println("6");
        for (int i = 0; i < TableUser.getRowCount(); i++) {
            if(ip.equals(TableUser.getValueAt(i, 1)) && port.equals(TableUser.getValueAt(i, 2))){
                user  = TableUser.getValueAt(i, 0).toString();
            }
        }
        return user;
    }
    public void SetChat(String ip,String port, String msg){
        String username = null;
        if(ip != null && port != null)
            username = ReturnUser(ip, port);
            if (username != null)
                textChat.setText(textChat.getText()+"\n"+ReturnData()+" - "+username+" Diz: "+msg);
        else
            textChat.setText(textChat.getText()+"\n"+ReturnData()+" - Eu: "+msg);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtLogin;
    private javax.swing.JButton BtLogout;
    private javax.swing.JToggleButton BtSend;
    private javax.swing.JTable TableUser;
    private javax.swing.JTextArea TextDebug;
    private javax.swing.JTextField TextIp;
    private javax.swing.JTextField TextMsg;
    private javax.swing.JTextField TextPassword;
    private javax.swing.JTextField TextPort;
    private javax.swing.JTextField TextStatus;
    private javax.swing.JTextField TextUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textChat;
    // End of variables declaration//GEN-END:variables

}