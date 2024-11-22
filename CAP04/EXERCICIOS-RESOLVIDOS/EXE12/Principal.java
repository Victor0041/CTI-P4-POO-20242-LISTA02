package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opt;
        float sal, aumento, n_sal;

        System.out.println("Aumento de salário de acordo com o cargo\n");
        System.out.println("CÓDIGO        CARGO");
        System.out.println("  1        Escriturário");
        System.out.println("  2        Secretário");
        System.out.println("  3        Caixa");
        System.out.println("  4        Gerente");
        System.out.println("  5        Diretor\n");

        System.out.print("Digite o código referente ao seu cargo: ");
        opt = scanner.nextInt();
        System.out.println("------------------------------------------------------");

        switch (opt) {
            case 1:
                System.out.println("Cargo de Escriturário\n");
                System.out.print("Digite seu salário: ");
                sal = scanner.nextFloat();

                aumento = sal * 0.5f;
                n_sal = sal + aumento;

                System.out.printf("    O seu aumento será de %.2f reais\n", aumento);
                System.out.printf("    Seu novo salário será de %.2f reais\n", n_sal);
                System.out.println("------------------------------------------------------");
                break;

            case 2:
                System.out.println("Cargo de Secretário\n");
                System.out.print("Digite seu salário: ");
                sal = scanner.nextFloat();

                aumento = sal * 0.35f;
                n_sal = sal + aumento;

                System.out.printf("    O seu aumento será de %.2f reais\n", aumento);
                System.out.printf("    Seu novo salário será de %.2f reais\n", n_sal);
                System.out.println("------------------------------------------------------");
                break;

            case 3:
                System.out.println("Cargo de Caixa\n");
                System.out.print("Digite seu salário: ");
                sal = scanner.nextFloat();

                aumento = sal * 0.2f;
                n_sal = sal + aumento;

                System.out.printf("    O seu aumento será de %.2f reais\n", aumento);
                System.out.printf("    Seu novo salário será de %.2f reais\n", n_sal);
                System.out.println("------------------------------------------------------");
                break;

            case 4:
                System.out.println("Cargo de Gerente\n");
                System.out.print("Digite seu salário: ");
                sal = scanner.nextFloat();

                aumento = sal * 0.1f;
                n_sal = sal + aumento;

                System.out.printf("    O seu aumento será de %.2f reais\n", aumento);
                System.out.printf("    Seu novo salário será de %.2f reais\n", n_sal);
                System.out.println("------------------------------------------------------");
                break;

            case 5:
                System.out.println("Cargo de Diretor\n");
                System.out.println("    Não determinado\n");
                System.out.println("------------------------------------------------------");
                break;

            default:
                System.out.println("------------------------------------------------------");
                System.out.println("Código inválido\n");
                System.out.println("------------------------------------------------------");
                break;
        }

        scanner.close();
    }
}
