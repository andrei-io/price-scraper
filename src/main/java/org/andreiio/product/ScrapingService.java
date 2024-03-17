package org.andreiio.product;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ScrapingService {
    private final String USER_AGENT = "Mozilla/5.0";

    public String getHtml(String link) throws Exception {
        // TODO: add selenium support for website that work on javascript
        // TODO: proper exception handling

        // TODO inject this
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
