package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float sal, aumento;

        System.out.println("Cálculo de novo salário com base em bonificação e auxílio escola\n");
        System.out.print("Digite o seu salário: ");
        sal = scanner.nextFloat();

        if (sal < 500) {
            System.out.println("    Você tem direito a 5% de aumento.");
            System.out.printf("    Seu novo salário será de %.2f\n\n", sal * 1.05);
        } else if (sal >= 500 && sal < 600) {
            System.out.println("    Você tem direito a 12% de aumento e ao auxílio escola de R$ 150,00.");
            System.out.printf("    Seu novo salário será de %.2f\n\n", sal * 1.12 + 150);
        } else if (sal >= 600 && sal <= 1200) {
            System.out.println("    Você tem direito a 12% de aumento.");
            System.out.printf("    Seu novo salário será de %.2f\n\n", sal * 1.12);
        } else if (sal > 1200) {
            System.out.println("    Você tem direito a 12% de aumento e ao auxílio escola de R$ 100,00.");
            System.out.printf("    Seu novo salário será de %.2f\n\n", sal * 1.12 + 100);
        }

        scanner.close();
    }
}
