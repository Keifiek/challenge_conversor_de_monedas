package com.alurachallenges.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consulta {
    public moneda consultaMoneda(String monedaOrigen, String monedaDestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7029e469d6bbda61beb2f1af/pair/" + monedaOrigen + "/" + monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), moneda.class);
        }catch (Exception e){
            throw new RuntimeException("Ocurrio un error con los codigos de las divisas");
        }
    }
}
