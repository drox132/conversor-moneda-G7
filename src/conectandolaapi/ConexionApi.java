package conectandolaapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {
    private String codigoMonedaBase ;
    final String API_KEY = "727ebca2a8aad34826e27fcb";


    public ConexionApi(String codigoMoneda) {
        this.codigoMonedaBase = codigoMoneda;
    }

    public String getJson() throws IOException, InterruptedException {

        String urlApiConversor = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/"+codigoMonedaBase;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlApiConversor))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        return response.body();
    }

}
