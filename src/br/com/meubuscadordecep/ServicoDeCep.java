package br.com.meubuscadordecep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ServicoDeCep {
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;
    
    public static Endereco buscaEnderecoPelo(String cep) {
        String urlParaChamada = webService + cep + "/json";
        
        try{
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Accept", "application/json");
            
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : "+ conexao.getResponseCode());
            
            BufferedReader buffereReader = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
           
            String retorno;
            while ((retorno = buffereReader.readLine()) != null) {
                System.out.println(retorno);
            }
           
            conexao.disconnect();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return new Endereco("teste", "teste", "teste");
    }
}