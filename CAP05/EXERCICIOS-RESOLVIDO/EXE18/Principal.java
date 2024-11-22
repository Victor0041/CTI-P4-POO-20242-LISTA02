import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float num, quadrado, cubo, raiz;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextFloat();

            quadrado = (float) Math.pow(num, 2);
            cubo = (float) Math.pow(num, 3);
            raiz = (float) Math.sqrt(num);

            System.out.printf("    Quadrado de %.2f: %.2f.\n", num, quadrado);
            System.out.printf("    Cubo de %.2f: %.2f.\n", num, cubo);
            System.out.printf("    Raiz quadrada de %.2f: %.2f.\n\n", num, raiz);

            System.out.println("Para encerrar digite um número negativo ou 0. Para continuar digite um número qualquer.");
            System.out.println("---------------------------------------------------------------------- 2");

        } while (num > 0);

        scanner.close();
    }
}
