package com.pollorosa.convermonedas.modelo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchangerate {

     public void consultar(String base, String target) throws IOException, InterruptedException {
        String uri = "https://v6.exchangerate-api.com/v6/96504db098ab841720a83dfb/pair/" +
                base.toUpperCase() + "/" + target.toUpperCase();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();


    }
}
