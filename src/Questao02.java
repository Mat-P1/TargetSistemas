import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3 = 0, valor;

        System.out.print("Digite um número inteiro: ");
        valor = read.nextInt();

        while (valor > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        if (valor == 0 || valor == 1) {
            System.out.print("O número "+ valor + " faz parte da sequência de Fibonacci.");
        } else if (valor == n3) {
            System.out.print("O número "+ valor + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.print("O número "+ valor + " não faz parte da sequência de Fibonacci.");
        }
    }
}
