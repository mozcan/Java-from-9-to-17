package com.mozcan.java9;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class httpclient {
    public static void main(String[] args) throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .headers("key1", "value1", "key2", "value2")
                .GET()
                .build();

        var body = request.bodyPublisher();
    }
}
