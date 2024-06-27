public class CalculoPixelsTV {

    public static void main(String[] args) {
        // Tamanho da tela em polegadas
        double tamanhoTelaPolegadas = 55.0;

        // Resolução 4K padrão: 3840 x 2160 pixels
        int larguraPixels = 3840;
        int alturaPixels = 2160;

        // Calculando a diagonal real da tela em polegadas (teorema de Pitágoras)
        double diagonalRealPolegadas = Math.sqrt(larguraPixels * larguraPixels + alturaPixels * alturaPixels);

        // Relação de aspecto da tela (16:9)
        double larguraRealPolegadas = tamanhoTelaPolegadas * Math.sqrt(16) / Math.sqrt(337);

        // Calculando o número total de pixels
        long totalPixels = larguraPixels * alturaPixels;

        // Exibindo os resultados
        System.out.println("Uma TV 4K de " + tamanhoTelaPolegadas + " polegadas tem aproximadamente:");
        System.out.println("- Largura: " + larguraPixels + " pixels");
        System.out.println("- Altura: " + alturaPixels + " pixels");
        System.out.println("- Total de Pixels: " + totalPixels);
    }
}
