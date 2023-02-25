package com.mozcan.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class httpclient {

    private static final HttpClient httpclient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .headers("key1", "value1", "key2", "value2")
                .GET()
                .build();

        var response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
