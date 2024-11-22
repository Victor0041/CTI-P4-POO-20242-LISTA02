import java.util.Scanner;

public class DividaComJuros {

    public static void main(String[] args) {

        // Inicializando o scanner para captura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int i, quant_parcela = 3, per_juros = 10, juros;
        float valor_divida, valor_parcela, total;

        // Entrada do valor da dívida
        System.out.print("Digite o valor da divida: ");
        valor_divida = scanner.nextFloat();
        System.out.printf("VALOR DA DIVIDA: R$ %.2f \n\n", valor_divida);

        // Primeira parcela sem juros
        System.out.println("QTDE de parcela: 1");
        System.out.println("Juros: 0%");
        System.out.printf("Valor da parcela: R$ %.2f \n\n", valor_divida);

        // Loop para calcular as parcelas com juros
        for (i = 1; i <= 12; i = i + 3) {
            juros = (int) (valor_divida * per_juros / 100);
            total = valor_divida + juros;
            valor_parcela = total / quant_parcela;

            System.out.println("QTDE de parcela: " + quant_parcela);
            System.out.println("Juros: " + per_juros + "%");
            System.out.printf("Valor da parcela: R$ %.2f \n", valor_parcela);
            System.out.println("Valor dos juros: " + juros);
            System.out.printf("Valor total: R$ %.2f \n\n", total);

            quant_parcela = quant_parcela + 3;
            per_juros = per_juros + 5;
        }

        // Fechando o scanner
        scanner.close();
    }
}
