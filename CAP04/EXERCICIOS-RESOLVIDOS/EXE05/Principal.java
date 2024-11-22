import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4;

        System.out.println("Números em ordem decrescente\n");
        System.out.println("Digite três números em ordem CRESCENTE.\n");

        System.out.print("    Digite um número: ");
        n1 = scanner.nextInt(); // Menor número

        System.out.print("    Digite um número: ");
        n2 = scanner.nextInt();

        System.out.print("    Digite um número: ");
        n3 = scanner.nextInt(); // Maior número

        System.out.print(" \nDigite um número fora da ordem: ");
        n4 = scanner.nextInt();
        System.out.println();

        // Condições
        if (n4 > n3) {
            System.out.printf("A ordem decrescente dos números é: %d, %d, %d, %d.\n", n4, n3, n2, n1);
        } else if (n4 > n2) {
            System.out.printf("A ordem decrescente dos números é: %d, %d, %d, %d.\n", n3, n2, n4, n1);
        } else if (n4 > n1) {
            System.out.printf("A ordem decrescente dos números é: %d, %d, %d, %d.\n", n3, n4, n2, n1);
        } else if (n4 < n1) {
            System.out.printf("A ordem decrescente dos números é: %d, %d, %d, %d.\n", n4, n3, n2, n1);
        }

        scanner.close();
    }
}
