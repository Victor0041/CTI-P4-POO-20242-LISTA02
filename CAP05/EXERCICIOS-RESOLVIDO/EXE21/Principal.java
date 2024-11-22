import java.util.Scanner;

public class CalculoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, soma = 0, verificarPar, maiorNum = Integer.MIN_VALUE, menorNum = Integer.MAX_VALUE;
        int i = 0, contImpar = 0, contPar = 0; // Contadores

        float media, mediaPares = 0, somaPares = 0, perImpar;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            System.out.println();

            soma += num;
            verificarPar = num % 2;

            // Verificar se número é par ou ímpar
            if (verificarPar == 0) {
                somaPares += num;
                contPar++;
            } else {
                contImpar++;
            }

            // Verificar maior e menor número
            if (num > maiorNum) {
                maiorNum = num;
            }
            if (num < menorNum) {
                menorNum = num;
            }

            i++;

            System.out.print("Para continuar digite qualquer número ou digite 30000 para sair: ");
            num = scanner.nextInt();
            System.out.println("------------------------------------------------------------------------");

        } while (num != 30000);

        media = (float) soma / i;
        mediaPares = contPar > 0 ? somaPares / contPar : 0; // Evitar divisão por 0
        perImpar = (float) contImpar * 100 / i;

        System.out.printf("A soma dos números digitados é %d.\n", soma);
        System.out.printf("Foi digitado %d números.\n", i);
        System.out.printf("A média dos números digitados é %.2f.\n", media);
        System.out.printf("O maior número digitado foi o %d.\n", maiorNum);
        System.out.printf("O menor número digitado foi o %d.\n", menorNum);
        System.out.printf("O percentual de números ímpares é de %.1f%%.\n", perImpar);

        scanner.close();
    }
}
