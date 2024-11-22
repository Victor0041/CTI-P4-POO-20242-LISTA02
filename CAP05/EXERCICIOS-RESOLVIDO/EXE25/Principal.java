import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float precoUnitario, seguro, valorTransporte, precoFinal;
        float totalImpostos = 0, imposto;

        int paisOrigem;
        int i = 1, contSeguro = 0;
        char meioTransporte, cargaPerigosa;

        do {
            System.out.println(i + "º Produto");
            System.out.print("Digite o preço unitário do produto: ");
            precoUnitario = scanner.nextFloat();
            if (precoUnitario <= 0) {
                break; // Sai do loop se o preço for 0 ou negativo
            }

            System.out.print("País de origem (1. EUA | 2. México | 3. Outros): ");
            paisOrigem = scanner.nextInt();
            System.out.print("Meio transporte (T. Terrestre | F. Fluvial | A. Aéreo): ");
            meioTransporte = scanner.next().charAt(0);

            // Cálculo de impostos
            if (precoUnitario <= 100) {
                imposto = precoUnitario * 0.05f;
            } else {
                imposto = precoUnitario * 0.10f;
            }

            totalImpostos += imposto;

            System.out.print("A carga é perigosa (S. Sim | N. Não): ");
            cargaPerigosa = scanner.next().charAt(0);

            switch (cargaPerigosa) {
                case 'S':
                    if (paisOrigem == 1) {
                        valorTransporte = 50;
                        precoFinal = precoUnitario + valorTransporte;
                    } else if (paisOrigem == 2) {
                        valorTransporte = 21;
                        precoFinal = precoUnitario + valorTransporte;
                    } else {
                        valorTransporte = 24;
                        precoFinal = precoUnitario + valorTransporte;
                    }
                    break;

                case 'N':
                    if (paisOrigem == 1) {
                        valorTransporte = 12;
                        precoFinal = precoUnitario + valorTransporte;
                    } else if (paisOrigem == 2) {
                        valorTransporte = 21;
                        precoFinal = precoUnitario + valorTransporte;
                    } else {
                        valorTransporte = 60;
                        precoFinal = precoUnitario + valorTransporte;
                    }
                    break;

                default:
                    valorTransporte = 0;
                    precoFinal = precoUnitario;
                    break;
            }

            // Produtos que vêm do México ou que utilizam transporte aéreo pagam metade de seu valor como seguro
            if (paisOrigem == 2 || meioTransporte == 'A') {
                seguro = precoUnitario / 2;
                precoFinal += seguro;
                contSeguro++;
            }

            // Exibição dos dados do produto
            System.out.println("\nDADOS SOBRE O PRODUTO");
            System.out.printf("    Preço unitário: R$ %.2f.\n", precoUnitario);
            System.out.printf("    Total de impostos: R$ %.2f.\n", imposto);
            System.out.printf("    Valor do transporte: R$ %.2f.\n", valorTransporte);
            if (contSeguro > 0) {
                System.out.printf("    Valor do seguro: R$ %.2f.\n", seguro);
            } else {
                System.out.println("    Produto não necessita de seguro.");
            }
            System.out.printf("    Preço total: R$ %.2f.\n", precoFinal);
            System.out.println("_____________________________________________________________\n");

            i++;
        } while (precoUnitario > 0);

        System.out.printf("Total de impostos: R$ %.2f.\n", totalImpostos);

        scanner.close();
    }
}
