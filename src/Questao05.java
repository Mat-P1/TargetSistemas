import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Insira uma palavra ou frase: ");
        String string = read.nextLine();

        char[] caractres = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            caractres[i] = string.charAt(i);
        }

        for (int i = 0, j = caractres.length - 1; i < j; i++, j--) {
            char c = caractres[i];
            caractres[i] = caractres[j];
            caractres[j] = c;
        }

        String stringInvertida = new String(caractres);

        System.out.println("String invertida: " + stringInvertida);
    }
}
