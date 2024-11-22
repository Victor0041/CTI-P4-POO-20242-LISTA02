import java.util.Scanner;

public class CalculaS {

    public static void main(String[] args) {

        // Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        int fim, i, j, x, expoente, numTermos, den, denominador, fat, s;

        expoente = 2;
        s = 0;
        denominador = 1;

        // Coleta de dados do usuário
        System.out.print("Digite o número de termos: ");
        numTermos = scanner.nextInt();
        System.out.print("Digite um valor positivo para X: ");
        x = scanner.nextInt();

        // Loop principal para calcular o valor de S
        for (i = 1; i <= numTermos; i++) {
            fim = denominador;
            fat = 1;

            // Calcula o fatorial do denominador
            for (j = 1; j <= fim; j++) {
                fat = fat * j;
            }

            expoente = i + 1;

            // Verifica se expoente é par ou ímpar
            if (expoente % 2 == 0) {
                s = s - (int) (Math.pow(x, 2) / fat);
            } else {
                s = s + (int) (Math.pow(x, 2) / fat);
            }

            // Atualiza o valor de denominador com base em condições
            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            } else {
                den = 1;
            }

            if (den == 1) {
                denominador = 1;
            } else {
                denominador = denominador - 1;
            }
        }

        // Exibe o valor final de S
        System.out.printf("S = %d.\n", s);

        // Fecha o scanner
        scanner.close();
    }
}
