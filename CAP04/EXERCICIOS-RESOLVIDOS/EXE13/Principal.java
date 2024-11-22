package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opt;
        float sal, imposto;

        System.out.println("CÓDIGO     OPÇÕES ");
        System.out.println("  1        Impostos ");
        System.out.println("  2        Novo salário ");
        System.out.println("  3        Classificação ");
        System.out.println();

        System.out.print("Digite a opção desejada: ");
        opt = scanner.nextInt();
        System.out.println();

        switch (opt) {
            // Se opção 1 for selecionada
            case 1:
                System.out.println("Impostos\n");
                System.out.print("    Digite o valor de seu salário: ");
                sal = scanner.nextFloat();

                if (sal < 500) {
                    imposto = sal * 0.05f;
                    System.out.printf("    Você pagará %.2f reais de impostos.\n\n", imposto);
                }

                if (sal >= 500 && sal <= 800) {
                    imposto = sal * 0.1f;
                    System.out.printf("    Você pagará %.2f reais de impostos.\n\n", imposto);
                }

                if (sal > 800) {
                    imposto = sal * 0.15f;
                    System.out.printf("    Você pagará %.2f reais de impostos.\n\n", imposto);
                }
                break;

            // Se opção 2 for selecionada
            case 2:
                System.out.println("Aumento de salário\n");
                System.out.print("    Digite o valor de seu salário: ");
                sal = scanner.nextFloat();

                if (sal > 1500) {
                    System.out.println("    O Seu aumento será de R$ 25,00.");
                    System.out.printf("    Seu novo salário será de %.2f reais\n\n", sal + 25);
                } else if (sal >= 750 && sal <= 1500) {
                    System.out.println("    O Seu aumento será de R$ 50,00.");
                    System.out.printf("    Seu novo salário será de %.2f reais\n\n", sal + 50);
                } else if (sal >= 450 && sal < 750) {
                    System.out.println("    O Seu aumento será de R$ 75,00.");
                    System.out.printf("    Seu novo salário será de %.2f reais\n\n", sal + 75);
                } else if (sal < 450) {
                    System.out.println("    O Seu aumento será de R$ 100,00.");
                    System.out.printf("    Seu novo salário será de %.2f reais\n\n", sal + 100);
                }
                break;

            // Se opção 3 for selecionada
            case 3:
                System.out.println("Classificação do salário\n");
                System.out.print("    Digite o valor de seu salário: ");
                sal = scanner.nextFloat();

                if (sal <= 700) {
                    System.out.println("    Mal remunerado.");
                } else {
                    System.out.println("    Bem remunerado.");
                }
                System.out.println();
                break;

            // Se não for digitada nenhuma das opções possíveis
            default:
                System.out.println("Opção inválida\n");
                break;
        }

        scanner.close();
    }
}
