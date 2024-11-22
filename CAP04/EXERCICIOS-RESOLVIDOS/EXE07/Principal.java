import java.util.Scanner;

public class OrdemNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int I;
        float A, B, C;

        System.out.print("Digite um número entre 1, 2 e 3: ");
        I = scanner.nextInt();

        System.out.println();
        System.out.println("Digite três números diferentes.");
        System.out.print("    Digite o primeiro número: ");
        A = scanner.nextFloat();
        System.out.print("    Digite o segundo número: ");
        B = scanner.nextFloat();
        System.out.print("    Digite o terceiro número: ");
        C = scanner.nextFloat();
        System.out.println();

        if (I == 1) {
            if ((A < B) && (B < C)) {
                System.out.printf("A ordem crescente dos números digitados é: %.0f, %.0f, %.0f\n\n", A, B, C);
            }
        } else if (I == 2) {
            if ((A < B) && (B < C)) {
                System.out.printf("A ordem decrescente dos números digitados é: %.0f, %.0f, %.0f\n\n", C, B, A);
            }
        } else if (I == 3) {
            if ((A > B && A > C)) {
                System.out.println("O número maior está no meio:");
                System.out.printf("%.0f - %.0f - %.0f\n\n", B, A, C);
            }

            if ((B > A && B > C)) {
                System.out.println("O número maior está no meio:");
                System.out.printf("%.0f - %.0f - %.0f\n\n", A, B, C);
            }

            if ((C > B && C > A)) {
                System.out.println("O número maior está no meio:");
                System.out.printf("%.0f - %.0f - %.0f\n\n", A, C, B);
            }
        } else {
            System.out.println("Programa não pode ser executado!\n\n");
        }

        scanner.close();
    }
}
