import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class ConversionDivisa {
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private final String apiKey;

    public ConversionDivisa (String apikey) {
        this.apiKey = apikey;
    }

    public void convertirMoneda (String divisaOrigen, String divisaDestino){
        try {
            URI uri = buildURI(divisaOrigen);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(uri)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                Divisa respuesta = gson.fromJson(response.body(), Divisa.class);

                if (respuesta != null && respuesta.getConversionRates() != null) {
                    Map<String, Double> conversionRates = respuesta.getConversionRates();

                    if (conversionRates.containsKey(divisaDestino)) {
                        double tasa = conversionRates.get(divisaDestino);
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Por favor, introduce el monto que desea convertir (" + divisaOrigen + " a " + divisaDestino + "): ");
                        double cantidad = scanner.nextDouble();
                        double cantidadConvertida = cantidad * tasa;
                        System.out.println("\n" + cantidad + " " + divisaOrigen + " equivale a " + cantidadConvertida + " " + divisaDestino +"\n\n");
                    } else {
                        System.out.println("No se encontró la tasa de conversión para " + divisaDestino);
                    }
                } else {
                    System.out.println("La respuesta de la API no contiene los datos esperados.");
                }
            } else {
                System.out.println("Error al realizar la solicitud. Código de estado: " + response.statusCode());
            }
        } catch (IOException | InterruptedException | URISyntaxException e) {
            System.err.println("Error al realizar la solicitud: " + e.getMessage());
        }
    }


    private URI buildURI(String divisaOrigen) throws URISyntaxException {
        String url = API_BASE_URL + apiKey + "/latest/" + divisaOrigen;
        return new URI(url);
    }
}

