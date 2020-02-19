package br.com.meubuscadordecep.viacep;

import br.com.meubuscadordecep.Util;
import br.com.meubuscadordecep.dominio.Endereco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoDeCep {
    static String webService = "http://viacep.com.br/ws/";
    static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Accept", "application/json");

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader buffereReader = new BufferedReader(new InputStreamReader((conexao.getInputStream())));

            String jsonEmString = Util.converteJsonEmString(buffereReader);
            System.out.println(jsonEmString);

            //converter string em JSON
            //converter JSON em Objeto Endereco
            //retornar Endereco

            return new Endereco("", "", "");
        } catch (Exception e) {
            throw new Exception("Ocorreu um erro inesperado: " + e);
        }
    }
}