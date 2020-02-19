package br.com.meubuscadordecep;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;

    public Endereco(String logradouro, String bairro, String localidade) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }
    
}
