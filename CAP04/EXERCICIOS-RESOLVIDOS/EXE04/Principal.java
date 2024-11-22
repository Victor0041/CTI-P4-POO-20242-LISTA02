import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Números em ordem crescente\n");
        System.out.println("Digite 3 números inteiros diferentes.\n");

        System.out.print("    Digite um número: ");
        n1 = scanner.nextInt();

        System.out.print("    Digite um número: ");
        n2 = scanner.nextInt();

        System.out.print("   Digite um número: ");
        n3 = scanner.nextInt();

        System.out.println();

        // Condições
        if ((n1 > n2) && (n2 > n3)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n3, n2, n1);
        } else if ((n1 > n3) && (n2 > n3)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n2, n3, n1);
        } else if ((n2 > n1) && (n1 > n3)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n3, n1, n2);
        } else if ((n2 > n3) && (n3 > n1)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n1, n3, n2);
        } else if ((n3 > n1) && (n1 > n2)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n2, n1, n3);
        } else if ((n3 > n2) && (n2 > n1)) {
            System.out.printf("A ordem crescente dos números é: %d, %d, %d\n", n1, n2, n3);
        } else {
            // Se todas as opções forem falsas, essa será executada.
            System.out.println("Digite números diferentes\n");
        }

        scanner.close();
    }
}
