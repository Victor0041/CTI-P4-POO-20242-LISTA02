import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, media, exame;

        System.out.println("Nota final\n");

        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        n3 = scanner.nextFloat();

        System.out.println("\nMÉDIA ARITMÉTICA");
        System.out.println("    >= 0 e < 3 - Reprovado");
        System.out.println("    >= 3 e < 7 - Exame");
        System.out.println("    >= 7 e <= 10 - Aprovado\n");

        media = (n1 + n2 + n3) / 3;

        // Início das condicionais
        if (media >= 0 && media < 3) {
            System.out.printf("Sua média é %.2f, portanto está reprovado\n", media);
        } else if (media >= 3 && media < 7) {
            exame = 6 - media;
            System.out.printf("Sua média é %.2f, portanto está em exame\n", media);
            System.out.printf("Falta %.2f pontos para você ser aprovado.\n\n", exame);
        } else if (media >= 7 && media <= 10) {
            System.out.printf("Sua média é %.2f, portanto está aprovado\n", media);
        }

        scanner.close();
    }
}
