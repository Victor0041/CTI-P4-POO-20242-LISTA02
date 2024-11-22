import java.util.Scanner;

public class ConceitoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, media, conceito;

        System.out.println("CONCEITO DO ALUNO\n");

        System.out.print("Digite a nota do trabalho de laboratório: ");
        n1 = scanner.nextFloat();

        System.out.print("Digite a nota da avaliação semestral: ");
        n2 = scanner.nextFloat();

        System.out.print("Digite a nota do exame final: ");
        n3 = scanner.nextFloat();

        System.out.println("\nO cálculo da média será realizado usando os seguintes pesos:\n");
        System.out.println("        Trabalho de laboratório: Peso 2");
        System.out.println("        Avaliação semestral: Peso 3");
        System.out.println("        Exame final: Peso 5\n");

        // Cálculo da média ponderada
        media = (n1 * 2) + (n2 * 3) + (n3 * 5);
        conceito = media / 10;

        // Início das condicionais
        if (conceito >= 0 && conceito < 5) {
            System.out.printf("Sua nota final é %.2f pontos, portanto seu conceito será E\n\n", conceito);
        } else if (conceito >= 5 && conceito < 6) {
            System.out.printf("Sua nota final é %.2f pontos, portanto seu conceito será D\n\n", conceito);
        } else if (conceito >= 6 && conceito < 7) {
            System.out.printf("Sua nota final é %.2f pontos, portanto seu conceito será C\n\n", conceito);
        } else if (conceito >= 7 && conceito < 8) {
            System.out.printf("Sua nota final é %.2f pontos, portanto seu conceito será B\n\n", conceito);
        } else if (conceito >= 8) {
            System.out.printf("Sua nota final é %.2f pontos, portanto seu conceito será A\n\n", conceito);
        }

        scanner.close();
    }
}
