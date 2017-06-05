/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio.iantas
 */
public class SendMessage {
    DatagramPacket request;
    DatagramSocket aSocket;
    
    public SendMessage(){
        try {
            aSocket = new DatagramSocket();
        } catch (SocketException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Send(String msg, 
                     String ip, 
                     Integer port, 
                     FrameClient frame) throws UnknownHostException, IOException{
        String resposta = null;
        DatagramPacket serverreply;
        try {
            byte[] buffer = new byte[1000];
            buffer = msg.getBytes();
            InetAddress aHost = InetAddress.getByName(ip);
            request = new DatagramPacket(buffer, buffer.length, aHost, port);
            aSocket.send(request);
            ListennerServer listenner = new ListennerServer(aSocket, frame);
            if ("1".equals(msg.substring(0, msg.indexOf("#")))){
                if(!listenner.isAlive()){ 
                    listenner.start();
                }
            }
        } catch (SocketException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        }
    }
}
