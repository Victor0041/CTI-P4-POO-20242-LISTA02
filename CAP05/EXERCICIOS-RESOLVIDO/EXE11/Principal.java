import java.util.Scanner;

public class VerificarNumeroPrimo {

    public static void main(String[] args) {

        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int num, resto, verificacao = 0;

        // Pedindo o número ao usuário
        System.out.println("Verificar se um número é primo ou não.");
        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        // Verificando se o número é primo
        for (int i = 1; i < num; i++) {
            resto = num % i;

            if (resto == 0) {
                verificacao++;
            }
        }

        // Se o número for maior que 2 divisores ou igual a 4, não é primo
        if (verificacao > 2 || num == 4) {
            System.out.println("Não é primo.");
        } else {
            System.out.println("É primo.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
