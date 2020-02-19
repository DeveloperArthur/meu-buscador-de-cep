package br.com.meubuscadordecep;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.bind.JAXBException;

public class Main {
    
    public static void main(String[] args) throws IOException, JAXBException {
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
        System.out.println(endereco.toString());
    }
    
}
