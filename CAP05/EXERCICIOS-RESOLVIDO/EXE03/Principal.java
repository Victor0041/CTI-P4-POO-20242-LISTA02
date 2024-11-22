import java.util.Scanner;

public class CalculoFatorial {

    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int quant, num;
        int fat;

        // Entrada da quantidade de números a serem lidos
        System.out.print("Digite a quantidade de valores que devem ser lidos a seguir: ");
        quant = scanner.nextInt();

        // Loop para processar cada número
        for (int i = 1; i <= quant; i++) {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            // Inicializa o fatorial como 1
            fat = 1;

            // Cálculo do fatorial
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }

            // Exibe o resultado do fatorial
            System.out.println("Seu fatorial: " + fat + "\n");
        }

        // Fecha o scanner
        scanner.close();
    }
}
