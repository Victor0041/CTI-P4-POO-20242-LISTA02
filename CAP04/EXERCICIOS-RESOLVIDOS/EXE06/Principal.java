import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, div;

        System.out.println("Verificar se número é par ou ímpar\n");
        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        div = num % 2; // Utiliza-se % para armazenar o resto da divisão.

        System.out.println();

        if (div == 0) { // == igual a...
            System.out.printf("O número %d é par.\n", num);
        } else {
            System.out.printf("O número %d é ímpar.\n", num);
        }

        scanner.close();
    }
}
