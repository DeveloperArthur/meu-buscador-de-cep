package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
        System.out.println("Dados do Endereço");
        System.out.println("Logradouro: "+endereco.getLogradouro());
        System.out.println("Bairro: "+endereco.getBairro());
        System.out.println("Localidade: "+endereco.getLocalidade());
    }

}
