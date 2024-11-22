import java.util.Scanner;

public class Serie {

    public static void main(String[] args) {

        // Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);

        // Definindo as variáveis
        int num_termos;
        int num1 = 2, num2 = 7, num3 = 3;

        // Exibindo informações iniciais
        System.out.println("Calculo de série\n");

        // Pedindo o número de termos
        System.out.print("Digite o número de termos: ");
        num_termos = scanner.nextInt();

        // Imprimindo os primeiros termos
        System.out.print(num1 + " - ");
        System.out.print(num2 + " - ");
        System.out.print(num3 + " - ");

        // Laço para calcular e exibir a série
        for (int i = 1; i <= num_termos; i++) {
            if (i != num_termos) {
                num1 = num1 * 2;
                System.out.print(num1 + " - ");
            }
            if (i != num_termos) {
                num2 = num2 * 3;
                System.out.print(num2 + " - ");
            }
            if (i != num_termos) {
                num3 = num3 * 4;
                System.out.print(num3 + " - ");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
