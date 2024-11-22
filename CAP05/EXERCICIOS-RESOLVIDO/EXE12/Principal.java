import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {

        // Inicializando scanner para captura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        char sexo;
        int i, num_peca, num_operario;
        int total_pecaH = 0, total_pecaF = 0, total_peca = 0;
        float salario_minimo = 450, sal_operario, bonus, folha_de_pagamento = 0;
        float maior_salario = 0;
        int maior_num = 0;
        float medPeca_homem = 0, medPeca_mulher = 0;

        // Loop para registrar os 15 operários
        for (i = 1; i <= 15; i++) {
            System.out.println("OPERÁRIO " + i);
            System.out.print("Digite seu sexo (m/f): ");
            sexo = scanner.next().charAt(0);

            if (sexo == 'm') { // Para operários masculinos
                System.out.print("Digite o número do operário: ");
                num_operario = scanner.nextInt();
                System.out.print("Digite o número de peças fabricadas: ");
                num_peca = scanner.nextInt();
                System.out.println("Nº Operário: " + num_operario);

                // Calculando o salário
                if (num_peca <= 30) {
                    bonus = (num_peca - 30) * (0.03 * salario_minimo);
                    sal_operario = salario_minimo;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                } else if (num_peca > 30 && num_peca <= 50) {
                    bonus = (num_peca - 30) * (0.03 * salario_minimo);
                    sal_operario = salario_minimo + bonus;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                } else if (num_peca > 50) {
                    bonus = (num_peca - 30) * (0.05 * salario_minimo);
                    sal_operario = salario_minimo + bonus;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                }

                total_pecaH += num_peca;
            } else if (sexo == 'f') { // Para operárias femininas
                System.out.print("Digite o número do operário: ");
                num_operario = scanner.nextInt();
                System.out.print("Digite o número de peças fabricadas: ");
                num_peca = scanner.nextInt();

                // Calculando o salário
                if (num_peca <= 30) {
                    sal_operario = salario_minimo;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                } else if (num_peca > 30 && num_peca < 50) {
                    bonus = (num_peca - 30) * (0.03 * salario_minimo);
                    sal_operario = salario_minimo + bonus;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                } else if (num_peca > 50) {
                    bonus = (num_peca - 30) * (0.05 * salario_minimo);
                    sal_operario = salario_minimo + bonus;
                    System.out.printf("Seu salário será de R$ %.2f. \n", sal_operario);
                }

                total_pecaF += num_peca;
            }

            // Determinando o maior salário
            if (sal_operario > maior_salario) {
                maior_salario = sal_operario;
                maior_num = num_operario;
            }

            folha_de_pagamento += sal_operario;

            // Calculando a média de peças por sexo
            total_peca = total_pecaH + total_pecaF;

            if (total_pecaH != 0) {
                medPeca_homem = (float) total_pecaH / 15; // Média de peças dos homens
            }

            if (total_pecaF != 0) {
                medPeca_mulher = (float) total_pecaF / 15; // Média de peças das mulheres
            }

            System.out.println();
        }

        // Exibindo a folha de pagamento
        System.out.println("\nFOLHA DE PAGAMENTO");
        System.out.printf("Total folha de pagamento: R$ %.2f. \n\n", folha_de_pagamento);

        System.out.printf("Média de peças fabricadas por mulheres: %.2f \n", medPeca_mulher);
        System.out.printf("Média de peças fabricadas por homens: %.2f \n", medPeca_homem);

        System.out.printf("O funcionário de número %d recebe o maior salário, sendo de R$ %.2f. \n", maior_num, maior_salario);

        // Fechando o scanner
        scanner.close();
    }
}
