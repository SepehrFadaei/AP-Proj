package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import org.json.JSONObject;

public class LlamaService {

    public static void sendRequestToLlama(String json) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            String url = "http://localhost:11434/api/generate";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .header("Content-Type", "application/json")
                    .POST(BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("Response code: " + response.statusCode());

            String responseBody = response.body();
            String[] lines = responseBody.split("\\r?\\n");
            StringBuilder combinedResponse = new StringBuilder();

            for (String line : lines) {
                JSONObject jsonObject = new JSONObject(line);
                combinedResponse.append(jsonObject.getString("response"));
            }

            System.out.println("Combined Response: " + combinedResponse.toString().trim());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}