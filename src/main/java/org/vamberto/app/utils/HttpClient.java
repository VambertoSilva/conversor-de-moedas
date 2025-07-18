package org.vamberto.app.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    public static String get(String endereco) throws Exception {
        URL url = new URL(endereco);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder resposta = new StringBuilder();
        String linha;

        while ((linha = leitor.readLine()) != null) {
            resposta.append(linha);
        }

        leitor.close();
        return resposta.toString();
    }
}
