/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

/**
 *
 * @author Fabio
 */
public class EmailSetup {
    
    private String email;
    private String senha;
    private String ip_smtp;
    private String ip_imap;
    private int smtp_port;
    private int imap_port;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIp_smtp() {
        return ip_smtp;
    }

    public void setIp_smtp(String ip_smtp) {
        this.ip_smtp = ip_smtp;
    }

    public String getIp_imap() {
        return ip_imap;
    }

    public void setIp_imap(String ip_imap) {
        this.ip_imap = ip_imap;
    }

    public int getSmtp_port() {
        return smtp_port;
    }

    public void setSmtp_port(int smtp_port) {
        this.smtp_port = smtp_port;
    }

    public int getImap_port() {
        return imap_port;
    }

    public void setImap_port(int imap_port) {
        this.imap_port = imap_port;
    }
    
    
}
