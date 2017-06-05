/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilha;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario1
 */
public class TesteEnviarDadosPlanilha {
    public static void main(String[] args){
        try{
            Planilha p = new Planilha();
            
            String[] dados = {
                "Nome maroto",
                "22/10/2018",
                "10:50",
                "11:10",
                "33"};
            
            String intervalo = "A:E";
            //recebe um array de strings com os dados e uma string com o intervalo de colunas a inserir
            p.adicionarDados(dados,intervalo);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(0);
            
        } 
    }
}
