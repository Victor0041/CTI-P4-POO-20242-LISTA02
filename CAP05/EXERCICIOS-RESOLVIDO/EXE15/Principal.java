import java.util.Scanner;

public class CalculoCustos {

    public static void main(String[] args) {

        // Inicializando o scanner para captura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        char refrigeracao, categoria;
        int cont_barato = 0, cont_normal = 0, cont_caro = 0;
        float preco_unitario, preco_final, custo_estocagem;
        float maior_preco = 1, menor_preco = 1, media_adcionais;
        float impostos, total_impostosN = 0, total_impostosS = 0, total_impostos = 0;
        float total_estocagemN = 0, total_estocagemS = 0, total_estocagem = 0, total_adcionais;

        // Laço para capturar os dados dos 12 produtos
        for (int i = 1; i <= 12; i++) {

            System.out.println("CALCULO DE CUSTOS \n");

            System.out.print("O produto necessita de refrigeração? (S.Sim | N.Não): ");
            refrigeracao = scanner.next().charAt(0);
            System.out.println();

            if (refrigeracao == 'N' || refrigeracao == 'n') {
                System.out.println("_________________________________________");
                System.out.println("Produto não necessita de refrigeração.");
                System.out.println("A. Alimentação \nL. Limpeza \nV. Vestuário");
                System.out.print("\nDigite a categoria do produto: ");
                categoria = scanner.next().charAt(0);

                System.out.print("Digite o preço unitário do produto: ");
                preco_unitario = scanner.nextFloat();

                if (preco_unitario < 20) {
                    switch (categoria) {
                        case 'A':
                            System.out.println("Categoria Alimentos");
                            custo_estocagem = 2.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                        case 'L':
                            System.out.println("Categoria Limpeza");
                            custo_estocagem = 3.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                        case 'V':
                            System.out.println("Categoria Vestuário");
                            custo_estocagem = 3.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                    }
                } else if (preco_unitario >= 20 && preco_unitario <= 50) {
                    switch (categoria) {
                        case 'A':
                        case 'L':
                        case 'V':
                            System.out.println("Custo de estocagem: 0.00");
                            custo_estocagem = 0;
                            break;
                    }
                } else {
                    switch (categoria) {
                        case 'A':
                        case 'L':
                        case 'V':
                            custo_estocagem = categoria == 'L' ? 1.00f : 0;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                    }
                }

                total_estocagemN += custo_estocagem;

                impostos = preco_unitario * 0.02f;
                total_impostosN += impostos;

                preco_final = preco_unitario + impostos + total_estocagem;
                System.out.printf("Preço final: R$ %.2f. \n", preco_final);
            } else if (refrigeracao == 'S' || refrigeracao == 's') {
                System.out.println("Produto necessita de refrigeração.");
                System.out.println("A. Alimentação \nL. Limpeza \nV. Vestuário");
                System.out.print("\nDigite a categoria do produto: ");
                categoria = scanner.next().charAt(0);
                System.out.print("Digite o preço unitário do produto: ");
                preco_unitario = scanner.nextFloat();

                if (preco_unitario < 20) {
                    switch (categoria) {
                        case 'A':
                            custo_estocagem = 2.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                        case 'L':
                            custo_estocagem = 3.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                        case 'V':
                            custo_estocagem = 3.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                    }
                } else if (preco_unitario >= 20 && preco_unitario <= 50) {
                    switch (categoria) {
                        case 'A':
                        case 'L':
                        case 'V':
                            custo_estocagem = 6.00f;
                            System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                            break;
                    }
                } else {
                    switch (categoria) {
                        case 'A':
                            custo_estocagem = 5.00f;
                            break;
                        case 'L':
                            custo_estocagem = 2.00f;
                            break;
                        case 'V':
                            custo_estocagem = 4.00f;
                            break;
                    }
                    System.out.printf("Custo de estocagem: %.2f \n", custo_estocagem);
                }

                total_estocagemS += custo_estocagem;

                impostos = preco_unitario * 0.04f;
                total_impostosS += impostos;

                preco_final = preco_unitario + impostos + total_estocagemS;
                System.out.printf("Preço final: R$ %.2f. \n", preco_final);
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            // Categorizar o preço do produto
            if (preco_final < 20) {
                System.out.println("Este produto está barato.");
                cont_barato++;
            } else if (preco_final >= 20 && preco_final <= 100) {
                System.out.println("Este produto está com preço normal.");
                cont_normal++;
            } else {
                System.out.println("Este produto está caro.");
                cont_caro++;
            }

            if (preco_final > maior_preco) {
                maior_preco = preco_final;
            } else if (preco_final < menor_preco) {
                menor_preco = preco_final;
            }
        }

        // Calculando totais
        total_estocagem = total_estocagemN + total_estocagemS;
        total_impostos = total_impostosN + total_impostosS;
        total_adcionais = total_estocagem + total_impostos;
        media_adcionais = total_adcionais / 12;

        System.out.printf("Média dos valores adicionais: R$ %.2f. \n", media_adcionais);
        System.out.printf("Maior preço: R$ %.2f. \n", maior_preco);
        System.out.printf("Menor preço: R$ %.2f. \n", menor_preco);
        System.out.printf("Total de impostos: R$ %.2f. \n", total_impostos);

        System.out.println("Total de produtos com:");
        System.out.println("    Classificação barato: " + cont_barato);
        System.out.println("    Classificação normal: " + cont_normal);
        System.out.println("    Classificação caro: " + cont_caro);

        // Fechando o scanner
        scanner.close();
    }
}
