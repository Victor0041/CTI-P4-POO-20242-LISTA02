import java.util.Scanner;

public class CalculoFatorial {

    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int n;
        float e = 1;
        int fat;

        // Exibe a fórmula
        System.out.println("Cálculo da fórmula: ");
        System.out.println("E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N! \n");

        // Entrada do valor de N
        System.out.print("Digite um valor para N: ");
        n = scanner.nextInt();

        // Loop para calcular o valor de E
        for (int i = 1; i <= n; i++) {
            fat = 1;
            // Cálculo do fatorial de i
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            // Atualiza o valor de E
            e += 1.0 / fat;
        }

        // Exibe o resultado final de E
        System.out.printf("E = %.2f\n", e);

        scanner.close();
    }
}
