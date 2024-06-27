import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class QuantidadeEleitoresBrasileiros {

    public static void main(String[] args) {
        // URL da API do TSE que fornece informações sobre eleitores brasileiros
        String url = "http://divulgacandcontas.tse.jus.br/divulga/rest/v1/eleicao/listar/2022";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Faz a requisição GET para a API do TSE
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                // Verifica se a resposta foi bem-sucedida (código 200)
                if (response.getStatusLine().getStatusCode() == 200) {
                    // Extrai o corpo da resposta
                    HttpEntity entity = response.getEntity();
                    String jsonStr = EntityUtils.toString(entity);

                    // Converte a resposta JSON para um objeto JSONObject
                    JSONObject jsonObject = new JSONObject(jsonStr);

                    // Obtém o total de eleitores brasileiros
                    int totalEleitores = jsonObject.getInt("quantidadeEleitores");

                    // Exibe o resultado
                    System.out.println("Quantidade de eleitores brasileiros registrados: " + totalEleitores);
                } else {
                    System.out.println("Falha na requisição: " + response.getStatusLine().getReasonPhrase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
