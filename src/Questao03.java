public class Questao03 {
    public static void main(String[] args) {

        System.out.print("a) ");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nb) ");
        int n = 2;
        for (int i = 0; i < 7; i++) {
            System.out.print(n + " ");
            n *= 2;
        }

        System.out.print("\nc) ");
        for (int i = 0; i <= 7; i++) {
            System.out.print(i * i + " ");
        }

        System.out.print("\nd) ");
        for (int i = 2; i <= 6; i++) {
            System.out.print(i * i + " ");
        }

        System.out.print("\ne) ");
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 7; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.print("\nf) ");
        int[] f = {2, 10, 12, 16, 17, 18, 19, 200};
        for (int j : f) {
            System.out.print(j + " ");
        }
        System.out.println("\nEssa sequência é formada com todos os números que iniciam com a letra d. Não é possível fazer um algoritmo para calcular isso.");
    }
}
