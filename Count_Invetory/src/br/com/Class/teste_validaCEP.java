package br.com.Class;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class teste_validaCEP {
    public static void main(String[] args) {
        String cep = "07793-475";
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        //try cath para tratar erros
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpClient.newHttpClient();
            //variavel url
            String result = client.send(HttpRequest.newBuilder().GET().uri(URI.create(url)).build(), HttpResponse.BodyHandlers.ofString()).body();
            System.out.println(result);

            System.out.println("Cliente " + client);
            System.out.println("cliente conectado");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}

