/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import email.CaixaEntrada;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.Buffer;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio.iantas
 */
public class ListennerServer extends Thread {
    DatagramSocket aSocket;
    FrameClient frame;
    private boolean isActive = true;
    int cont1 = 0;
    int cont2 = 0;
    
    public ListennerServer(DatagramSocket aSocket, FrameClient frame){
        this.aSocket = aSocket;
        this.frame   = frame;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    @Override
    public void run(){
        String servmsg = null;
        do{
            byte [] buffer = new byte[1000];
            DatagramPacket request = new DatagramPacket(buffer,buffer.length);
            try {
                aSocket.receive(request);
                servmsg = new String(buffer, 0, request.getLength());
                if("2".equals(servmsg.substring(0, servmsg.indexOf("#")))){
                    frame.SetStatus(true);
                    frame.SetDebug("action=ReceiveList / MessageofServer: "+servmsg);
                    System.out.println("Client receive>"+cont1+":"+servmsg);
                    cont1++;
                    if (servmsg.length() > 10){
                        frame.AddRow(servmsg);
                        frame.SetStatus(true);
                    }else{
                        frame.SetStatus(true);
                    }
                }else if("4".equals(servmsg.substring(0, servmsg.indexOf("#")))){
                    frame.SetDebug("action=ReceiveMessage / MessageofServer: "+servmsg);
                    System.out.println("mensagem recebida: "+servmsg);
                    String[] msgReceive = servmsg.split("#");
                    frame.SetChat(msgReceive[1], msgReceive[2], msgReceive[3]);
                }else if("5".equals(servmsg.substring(0, servmsg.indexOf("#")))){
                    frame.SetStatus(false);
                    System.out.println("5Client receive>"+cont2+":"+servmsg.substring(0, servmsg.indexOf("#")));
                    cont2++;
                }else if("e1".equals(servmsg.substring(0, servmsg.indexOf("#")))){
                    frame.SetDebug("action=ReceiveMessage / MessageofServer: "+servmsg);
                    frame.SetStatus(false);
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos.");
                }
            } catch (IOException ex) {
                Logger.getLogger(ListennerServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(isActive);
        System.out.println("saiu thread");
        this.interrupt();
    }
}