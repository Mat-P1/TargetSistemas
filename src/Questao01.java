public class Questao01 {
    public static void main(String[] args) {
        int indice = 13, soma = 0, k = 0;

        do {
            k = k + 1;
            soma = soma + k;
        } while (k < indice);

        System.out.println("O valor da variável soma é: " + soma);
    }
}