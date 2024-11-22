import java.util.Scanner;

public class CalculoAreaTriangulo {

    public static void main(String[] args) {

        // Inicializando o scanner para capturar dados do usuário
        Scanner scanner = new Scanner(System.in);

        float area, altura, base;

        System.out.println("Cálculo da área de um triângulo\n");

        // Laço do-while para garantir que os valores sejam positivos
        do {
            System.out.print("Digite a altura: ");
            altura = scanner.nextFloat();
            System.out.print("Digite a base: ");
            base = scanner.nextFloat();

            if (base <= 0 || altura <= 0) {
                System.out.println("ENTRADA INVÁLIDA\n");
            }
        } while (altura <= 0 || base <= 0);  // O loop continua enquanto os valores forem negativos ou zero

        // Calculando a área do triângulo
        area = (altura * base) / 2;
        System.out.printf("\nA área do triângulo é de: %.2f.\n", area);

        // Fechando o scanner
        scanner.close();
    }
}
