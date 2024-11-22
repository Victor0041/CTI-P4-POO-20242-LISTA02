import java.util.Scanner;

public class ConsumoKW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salMinimo, vlrKw, acrescimo, total, valorGasto, faturamentoEmpresa = 0;
        int quantKw, tipoConsumidor, cont = 0, i = 1;

        System.out.println("Cálculo de consumo KW");

        do {
            quantKw = 0;

            System.out.printf("CONSUMIDOR %d\n", i);
            System.out.print("    Digite o valor do salário mínimo: ");
            salMinimo = scanner.nextFloat();
            vlrKw = salMinimo / 8;

            System.out.print("    Digite a quantidade de KW gasto: ");
            quantKw = scanner.nextInt();
            System.out.print("    Digite sua categoria (1. Residencial | 2. Comercial | 3. Industrial): ");
            tipoConsumidor = scanner.nextInt();

            valorGasto = quantKw * vlrKw;

            // Tipos de consumidores
            if (tipoConsumidor == 1) {
                acrescimo = valorGasto * 0.05f;
                total = valorGasto + acrescimo;
            } else if (tipoConsumidor == 2) {
                acrescimo = valorGasto * 0.1f;
                total = valorGasto + acrescimo;
            } else if (tipoConsumidor == 3) {
                acrescimo = valorGasto * 0.15f;
                total = valorGasto + acrescimo;
            } else {
                System.out.println("Valor inválido.");
                continue;
            }

            if (total >= 500 && total <= 1000) {
                cont++;
            }

            System.out.println("CONTA");
            System.out.printf("    Valor gasto: R$ %.2f.\n", valorGasto);
            System.out.printf("    Acréscimo: R$ %.2f;\n", acrescimo);
            System.out.printf("    Total a ser pago: R$ %.2f.\n", total);

            faturamentoEmpresa += total;

            System.out.print("\nDigite qualquer número para continuar ou 0 para sair: ");
            quantKw = scanner.nextInt();
            System.out.println("___________________________________________________________");

            i++;
        } while (quantKw != 0);

        System.out.printf("Faturamento total da empresa será de R$ %.2f.\n", faturamentoEmpresa);
        System.out.printf("Quantidade de pessoas que pagam entre R$ 500,00 e R$ 1000,00: %d\n", cont);

        scanner.close();
    }
}
