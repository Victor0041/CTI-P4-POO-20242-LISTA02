import java.util.Scanner;

public class ReajustePreco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float venda, preco_atual, n_preco, diminuicao;

        System.out.println("Reajuste de preço dos produtos de um supermercado\n");

        System.out.print("Digite o preço atual do produto: ");
        preco_atual = scanner.nextFloat();

        System.out.print("Digite a venda mensal média: ");
        venda = scanner.nextFloat();
        System.out.println();

        // Reajuste de preço
        if (preco_atual < 30 || venda < 500) {
            System.out.println("Será aumentado 10% no preço atual.");
            preco_atual = preco_atual * 1.10;
            System.out.printf("O preço reajustado será de %.2f reais\n", preco_atual);
            System.out.println();
        } else if ((preco_atual >= 30 && preco_atual < 80) || (venda <= 500 && venda < 1200)) {
            System.out.println("Será aumentado 15% no preço atual.");
            preco_atual = preco_atual * 1.15;
            System.out.printf("O preço reajustado será de %.2f reais\n", preco_atual);
            System.out.println();
        } else if ((preco_atual >= 80) || (venda >= 1200)) {
            System.out.println("Será diminuído em 20% no preço atual.");
            diminuicao = preco_atual * 0.2f;
            preco_atual = preco_atual - diminuicao;
            System.out.printf("O preço reajustado será de %.2f reais\n", preco_atual);
            System.out.println();
        }

        scanner.close();
    }
}
