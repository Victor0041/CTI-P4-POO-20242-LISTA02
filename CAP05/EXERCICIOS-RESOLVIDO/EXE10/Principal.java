import java.util.Scanner;

public class CampeonatoFutebol {

    public static void main(String[] args) {

        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int idade, somaIdade = 0, somaAltura = 0, idadeMenor18 = 0, pesoMaior80 = 0;
        float peso, altura, mediaIdade, totalMedia, totalMPeso = 0;
        int totalAltura = 0;

        // Laço para cada time
        for (int i = 1; i <= 5; i++) {
            System.out.println("TIME " + i + "\n");

            // Laço para cada jogador do time
            for (int j = 1; j <= 11; j++) {
                System.out.println("JOGADOR " + j);

                // Entrada de dados
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();
                System.out.print("Digite sua altura: ");
                altura = scanner.nextFloat();
                System.out.print("Digite seu peso: ");
                peso = scanner.nextFloat();
                System.out.println();

                // Acumulando dados para cálculos
                somaIdade += idade;
                somaAltura += altura;

                if (idade < 18) {
                    idadeMenor18++;
                }

                if (peso > 80) {
                    pesoMaior80++;
                }
            }

            // Cálculos para cada time
            mediaIdade = (float) somaIdade / 11;
            totalMPeso = pesoMaior80 * 0.55;

            // Exibindo resultados de cada time
            System.out.printf("Média de idade do time é de %.2f anos.\n\n", mediaIdade);
            totalAltura += somaAltura;

            // Resetando variáveis para o próximo time
            somaIdade = 0;
            somaAltura = 0;
            pesoMaior80 = 0;
        }

        // Calculando a média total de altura do campeonato
        totalMedia = (float) totalAltura / 5;

        // Exibindo resultados gerais
        System.out.printf("A média de altura do campeonato é de %.2f metros.\n", totalMedia);
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + idadeMenor18);
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f %%\n", totalMPeso);

        // Fechando o scanner
        scanner.close();
    }
}
