package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano, hr, min;

        System.out.println("Hora e data\n");

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();

        System.out.println();

        System.out.print("Digite a hora: ");
        hr = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        min = scanner.nextInt();

        System.out.println();

        switch (mes) {
            case 1:
                System.out.printf("%d / JANEIRO / %d", dia, ano);
                break;
            case 2:
                System.out.printf("%d / FEVEREIRO / %d", dia, ano);
                break;
            case 3:
                System.out.printf("%d / MARÇO / %d", dia, ano);
                break;
            case 4:
                System.out.printf("%d / ABRIL / %d", dia, ano);
                break;
            case 5:
                System.out.printf("%d / MAIO / %d", dia, ano);
                break;
            case 6:
                System.out.printf("%d / JUNHO / %d", dia, ano);
                break;
            case 7:
                System.out.printf("%d / JULHO / %d", dia, ano);
                break;
            case 8:
                System.out.printf("%d / AGOSTO / %d", dia, ano);
                break;
            case 9:
                System.out.printf("%d / SETEMBRO / %d", dia, ano);
                break;
            case 10:
                System.out.printf("%d / OUTUBRO / %d", dia, ano);
                break;
            case 11:
                System.out.printf("%d / NOVEMBRO / %d", dia, ano);
                break;
            case 12:
                System.out.printf("%d / DEZEMBRO / %d", dia, ano);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.printf("\n\n%d : %d\n\n", hr, min);

        scanner.close();
    }
}
