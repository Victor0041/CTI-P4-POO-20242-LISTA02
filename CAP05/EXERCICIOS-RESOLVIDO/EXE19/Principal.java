import java.util.Scanner;

public class SomaIntervalo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M, N, i;
        int soma;

        do {
            System.out.print("Digite M: ");
            M = scanner.nextInt();
            System.out.print("Digite N: ");
            N = scanner.nextInt();

            soma = 0; // Zera a soma a cada execução do loop

            for (i = M; i <= N; i++) {
                soma += i; // Adiciona o valor de i à soma
            }

            System.out.printf("A soma dos números entre %d e %d é: %d.\n\n", M, N, soma);

        } while (M < N);

        scanner.close();
    }
}
