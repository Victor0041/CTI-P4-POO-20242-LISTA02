import java.util.Scanner;

public class CalculoImpostoValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codProduto, codPais;
        float peso, gramas, preco, imposto;

        System.out.println("Cálculo de imposto e valor de cada grama\n");

        System.out.print("Digite o código do produto comprado (1 a 10): ");
        codProduto = scanner.nextInt();

        System.out.print("Digite o peso do produto (em KG): ");
        peso = scanner.nextFloat();

        System.out.print("Digite o código do país de origem (1 a 3): ");
        codPais = scanner.nextInt();

        if (codPais == 1 && codProduto >= 1 && codProduto <= 4) {
            // Cálculos
            gramas = peso * 1000;
            preco = gramas / 10;

            System.out.println("\n");
            System.out.printf("O peso %.2f em gramas é %.2f g\n", peso, gramas);
            System.out.printf("O preço total do produto é R$ %.2f\n", preco);
            System.out.println("Não será cobrado impostos.\n");
        } else if (codPais == 2 && codProduto >= 5 && codProduto <= 7) {
            // Cálculos
            gramas = peso * 1000;
            preco = gramas / 25;
            imposto = preco * 0.15;

            System.out.println("\n");
            System.out.printf("O peso %.2f em gramas é %.2f g\n", peso, gramas);
            System.out.printf("O preço total do produto é R$ %.2f\n", preco);
            System.out.printf("Impostos: R$ %.2f\n\n", imposto);
        } else if (codPais == 3 && codProduto >= 8 && codProduto <= 10) {
            // Cálculos
            gramas = peso * 1000;
            preco = gramas / 35;
            imposto = preco * 0.25;

            System.out.println("\n");
            System.out.printf("O peso %.2f em gramas é %.2f g\n", peso, gramas);
            System.out.printf("O preço total do produto é R$ %.2f\n", preco);
            System.out.printf("Impostos: R$ %.2f\n\n", imposto);
        } else {
            System.out.println("\n\nCOMANDO INVÁLIDO.");
        }

        scanner.close();
    }
}
