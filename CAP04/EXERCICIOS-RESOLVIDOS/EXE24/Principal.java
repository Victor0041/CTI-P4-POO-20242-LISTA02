import java.util.Scanner;

public class CalculadoraProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        float preco, imposto, custo, desconto;
        char tipo, refrig;

        // Entrada de dados
        System.out.print("Digite o preço do produto e aperte Enter: R$ ");
        preco = scanner.nextFloat();
        scanner.nextLine();  // Limpar o buffer após a leitura de número

        System.out.println("Digite o tipo do produto e aperte Enter:");
        System.out.println("'A' - Alimentação");
        System.out.println("'L' - Limpeza");
        System.out.println("'V' - Vestuário");
        tipo = scanner.nextLine().charAt(0);

        System.out.println("Digite o tipo de refrigeração do produto e aperte Enter:");
        System.out.println("'S' - Produto que precisa de refrigeração");
        System.out.println("'N' - Produto que não precisa de refrigeração");
        refrig = scanner.nextLine().charAt(0);

        // Lógica para calcular os custos adicionais com base no tipo e refrigeração
        switch (refrig) {
            case 'N':
                switch (tipo) {
                    case 'A':
                        if (preco < 15) {
                            preco += 2;
                            System.out.println("O valor adicional será de R$2.00");
                        } else {
                            preco += 5;
                            System.out.println("O valor adicional será de R$5.00");
                        }
                        break;
                    case 'L':
                        if (preco < 10) {
                            preco += 1.50;
                            System.out.println("O valor adicional será de R$1.50");
                        } else {
                            preco += 2.50;
                            System.out.println("O valor adicional será de R$2.50");
                        }
                        break;
                    case 'V':
                        if (preco < 30) {
                            preco += 3;
                            System.out.println("O valor adicional será de R$3.00");
                        } else {
                            preco += 2.50;
                            System.out.println("O valor adicional será de R$2.50");
                        }
                        break;
                    default:
                        System.out.println("Digite valores válidos!");
                }
                break;

            case 'S':
                switch (tipo) {
                    case 'A':
                        preco += 8;
                        System.out.println("O valor adicional será de R$8.00");
                        break;
                    case 'L':
                    case 'V':
                        System.out.println("Não haverá valor adicional");
                        break;
                    default:
                        System.out.println("Digite valores válidos!");
                }
                break;

            default:
                System.out.println("Digite valores válidos!");
        }

        // Cálculo do imposto
        if (preco < 25) {
            imposto = preco * 0.05f;
            System.out.printf("O imposto será de R$%.2f\n", imposto);
        } else {
            imposto = preco * 0.08f;
            System.out.printf("O imposto será de R$%.2f\n", imposto);
        }

        custo = preco + imposto;
        System.out.printf("O preço do custo do produto será de R$%.2f\n", custo);

        // Desconto
        if (tipo == 'A' && refrig == 'S') {
            imposto = 0;
            System.out.println("O produto não terá desconto");
        } else {
            desconto = 0.03f * preco;
            System.out.printf("O produto terá um desconto de R$%.2f\n", desconto);
            preco -= desconto;
        }

        System.out.printf("O novo preço do produto será de R$%.2f\n", preco);

        // Classificação do preço
        if (preco <= 50) {
            System.out.println("O produto é barato");
        } else if (preco > 50 && preco < 100) {
            System.out.println("O produto tem preço normal");
        } else {
            System.out.println("O produto é caro");
        }

        scanner.close();
    }
}
