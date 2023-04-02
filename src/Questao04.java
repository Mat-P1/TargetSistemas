public class Questao04 {
    public static void main(String[] args) {

        // Distância total entre ambos os véiculos no início da viagem

        double distanciaTotal = 100;

        // velocidade do carro e do caminhão em km/h

        double velocidadeCarro = 110;
        double velocidadeCaminhao = 80;

        // Calculando a velocidade média do caminhão levando em conta os pedágios onde 2 são o número de pedágios multiplicados por 5 (minutos) e divididos por 60 (minutos)

        double tempoSemPedagio = distanciaTotal / velocidadeCaminhao;
        double tempoComPedagio = tempoSemPedagio + (double) (2 * 5) / 60;
        double velocidadeMediaCaminhao = distanciaTotal / tempoComPedagio;

        // Calculando a distância do cruzamento

        double distanciaCruzamento = (velocidadeCarro * distanciaTotal) / (velocidadeCarro + velocidadeMediaCaminhao);

        System.out.printf("O cruzamento entre o carro e o caminhão ocorre a %.2f km de Ribeirão Preto. Ambos estão a mesma distância da cidade.", distanciaCruzamento);
    }
}