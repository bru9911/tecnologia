java
Copiar código
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class DadosPopulacionaisBrasil {

    public static void main(String[] args) {
        try {
            // URL da API do IBGE para obter a população estimada do Brasil
            String url = "https://servicodados.ibge.gov.br/api/v1/paises/BR";

            // Realiza a requisição HTTP GET para a API
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");

            // Lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Converte a resposta JSON para um objeto JSONObject
            JSONObject json = new JSONObject(response.toString());

            // Obtém a população estimada do Brasil
            int populacao = json.getJSONObject("populacao").getInt("estimativa");

            // Exibe os dados populacionais do Brasil
            System.out.println("Dados Populacionais do Brasil:");
            System.out.println("- População Estimada: " + populacao);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
