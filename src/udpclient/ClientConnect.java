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
public class ClientConnect{
    String ip;
    Integer port;
    DatagramSocket aSocket;
    DatagramPacket request;
    DatagramPacket reply;
    FrameClient frame;
    
    public ClientConnect(){
        try {
            aSocket = new DatagramSocket();
        } catch (SocketException ex) {
            Logger.getLogger(ClientConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String  startConnection(String msg, String ip, Integer port, FrameClient frame) throws UnknownHostException, IOException{
        String resposta = null;
        DatagramPacket serverreply;
        try {
            byte[] buffer = new byte[1000];
            buffer = msg.getBytes();
            InetAddress aHost = InetAddress.getByName(ip);
            request = new DatagramPacket(buffer, buffer.length, aHost, port);
            aSocket.send(request);
            new ListennerServer(aSocket, frame).start();
            /*if(!frame.connection){
                System.out.println("connection:true");
                byte[] breply = new byte[1000];
                reply = new DatagramPacket(breply,breply.length);
                aSocket.receive(reply);
                resposta = new String(breply, 0, reply.getLength());
                if ("2".equals(resposta.substring(0, resposta.indexOf("#")))){
                    new ListennerServer(aSocket, frame).start();
                    frame.SetStatus(true);
                }else if("5".equals(resposta.substring(0, resposta.indexOf("#")))){
                    System.out.println("isActive=false");
                }
            }*/
        } catch (SocketException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        }
        return resposta;
    }
}
