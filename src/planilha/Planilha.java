/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilha;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author usuario1
 */
public class Planilha {
     
    private static final String APPLICATION_NAME = "Cliente Email";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static HttpTransport HTTP_TRANSPORT;
    private static final List<String> SCOPES = Arrays.asList(SheetsScopes.SPREADSHEETS);
    
    /*static HttpTransport newProxyTransport() throws GeneralSecurityException, IOException {
        NetHttpTransport.Builder builder = new NetHttpTransport.Builder();
        builder.trustCertificates(GoogleUtils.getCertificateTrustStore());
        builder.setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.25.1.160", 3128)));
        return builder.build();
    }*/
    
    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            //HTTP_TRANSPORT = newProxyTransport();
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    public static GoogleCredential gerarCredencial() throws IOException {
        InputStream resourceAsStream = Planilha.class.getClassLoader().getResourceAsStream("auth/SistemasDistribuidos-2fd6ca520c40.json");
        return GoogleCredential.fromStream(resourceAsStream).createScoped(SCOPES);
    }

    
    public static Sheets servicoPlanilha() throws IOException {
        Credential credencial = gerarCredencial();
        return new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, credencial)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    
    public void adicionarDados(String[] args, String intervalo) throws IOException {
      
        Sheets servico = servicoPlanilha();
        String planilhaID = "1b26KHRHGAGvsq7J2lAPf8T0szI3CCOwnGDj_wMYiC9o";
        
        List<Object> dados = new ArrayList<>();
        dados.addAll(Arrays.asList(args));
        List<List<Object>> linha = new ArrayList<>();
        linha.add (dados);
        
        ValueRange dadosIntervalo = new ValueRange();
        dadosIntervalo.setValues(linha);
        servico.spreadsheets().values().
        append(planilhaID, intervalo, dadosIntervalo)
                .setValueInputOption("RAW")
                .execute();
        
        /*List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("Nenhum valor encontrado!");
        } else {
          System.out.println("A, B");
          values.forEach((row) -> {
              // Print columns A and E, which correspond to indices 0 and 4.
              System.out.printf("%s,%s\n", row.get(0),row.get(1));
            });
        }*/
    }
}
