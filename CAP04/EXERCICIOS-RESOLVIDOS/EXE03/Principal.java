import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.println("Descubra qual número é maior!\n");

        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite um número: ");
        n2 = scanner.nextInt();

        System.out.println();

        if (n1 > n2) {
            System.out.printf("%d é maior que %d\n", n1, n2);
        } else {
            System.out.printf("%d é maior que %d.\n\n", n2, n1);
        }

        scanner.close();
    }
}
