import java.util.Scanner;

public class EquacoesSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a, b, c, x1, x2, delta;

        System.out.println("Cálculo de equações de segundo grau\n");

        System.out.print("Digite o valor de A: ");
        a = scanner.nextFloat();

        System.out.print("Digite o valor de B: ");
        b = scanner.nextFloat();

        System.out.print("Digite o valor de C: ");
        c = scanner.nextFloat();
        System.out.println();

        // Cálculo do delta
        delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta > 0) {
            System.out.println("Cálculo das raízes");

            // Calculando as raízes
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("    X1 = %.2f\n", x1);
            System.out.printf("    X2 = %.2f\n\n", x2);

        } else if (delta == 0) {
            // Caso delta seja igual a zero, uma raiz real
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("    X1 = %.2f\n", x1);

        } else {
            // Caso delta seja negativo, não existe solução real
            System.out.printf("Impossível calcular.\n");
            System.out.printf("    Delta igual a %.2f.\n\n", delta);
        }

        scanner.close();
    }
}
