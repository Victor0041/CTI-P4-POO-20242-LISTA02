package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora simples\n");
        System.out.println("MENU DE OPÇÕES");
        System.out.println("    1. Somar dois números.");
        System.out.println("    2. Raiz quadrada de um número.\n");

        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("\nSOMA DE DOIS NÚMEROS\n");
            System.out.print("Digite um número: ");
            float num1 = scanner.nextFloat();
            System.out.print("Digite outro número: ");
            float num2 = scanner.nextFloat();
            float soma = num1 + num2;
            System.out.printf("\n    %.2f + %.2f = %.2f\n\n", num1, num2, soma);

        } else if (opcao == 2) {
            System.out.println("\nRAIZ QUADRADA DE UM NÚMERO\n");
            System.out.print("Digite um número: ");
            float num1 = scanner.nextFloat();

            if (num1 >= 0) {
                double raiz = Math.sqrt(num1);
                System.out.printf("    A raiz quadrada de %.2f é %.2f\n\n", num1, raiz);
            } else {
                System.out.println("    Número inválido para calcular a raiz quadrada.\n");
            }

        } else {
            System.out.println("\n\nComando inválido.\n\n");
        }

        scanner.close();
    }
}
