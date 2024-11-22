package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano;
        int dia2, mes2, ano2;
        int soma1, soma2;

        System.out.println("Comparador de datas\n");

        // Entrada para a primeira data
        System.out.println("Primeira data");
        System.out.print("    Digite o dia (1 a 31): ");
        dia = scanner.nextInt();
        System.out.print("    Digite o mês (1 a 12): ");
        mes = scanner.nextInt();
        System.out.print("    Digite o ano: ");
        ano = scanner.nextInt();

        System.out.println();

        // Entrada para a segunda data
        System.out.println("Segunda data");
        System.out.print("    Digite o dia (1 a 31): ");
        dia2 = scanner.nextInt();
        System.out.print("    Digite o mês (1 a 12): ");
        mes2 = scanner.nextInt();
        System.out.print("    Digite o ano: ");
        ano2 = scanner.nextInt();

        // Cálculo das somas
        soma1 = dia + mes + ano;
        soma2 = dia2 + mes2 + ano2;

        // Comparação das somas
        System.out.println();
        if (soma1 > soma2) {
            System.out.printf("A maior data é %d/%d/%d\n\n", dia, mes, ano);
        } else {
            System.out.printf("A maior data é %d/%d/%d\n\n", dia2, mes2, ano2);
        }

        scanner.close();
    }
}
