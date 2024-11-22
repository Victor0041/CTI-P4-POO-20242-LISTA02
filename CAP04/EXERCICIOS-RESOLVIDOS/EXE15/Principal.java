package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dependentes, hr_extra, hr_trab;
        float sal_min, sal_mes, sal_bruto, sal_liq, imposto;
        float vlr_hrextra, vlr_hrtrabalhada, total_hrextra;

        System.out.println("Cálculo do salário total de um funcionário\n");
        
        System.out.print("Digite o valor do salário mínimo: ");
        sal_min = scanner.nextFloat();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        hr_trab = scanner.nextInt();
        
        System.out.print("Digite o número de dependentes do funcionário: ");
        dependentes = scanner.nextInt();
        
        System.out.print("Digite o número de horas extras trabalhadas: ");
        hr_extra = scanner.nextInt();

        // Cálculos segundo as regras propostas
        vlr_hrtrabalhada = sal_min / 5;
        sal_mes = hr_trab * vlr_hrtrabalhada;
        vlr_hrextra = vlr_hrtrabalhada * 1.5f;
        total_hrextra = vlr_hrextra * hr_extra;
        sal_bruto = total_hrextra + sal_mes;
        sal_bruto = sal_bruto + (32 * dependentes);

        System.out.println();

        // Cálculo dos impostos
        if (sal_bruto >= 200 && sal_bruto <= 500) {
            imposto = sal_bruto * 0.1f;
            sal_liq = sal_bruto - imposto;
        } else if (sal_bruto > 500) {
            imposto = sal_bruto * 0.2f;
            sal_liq = sal_bruto - imposto;
        } else {
            sal_liq = sal_bruto; // Caso o salário bruto seja menor que 200, sem imposto
        }

        // Cálculo de bonificação
        if (sal_liq < 350) {
            sal_liq = sal_liq + 100;
            System.out.printf("O valor total de seu salário é de %.2f reais.\n", sal_liq);
        } else {
            sal_liq = sal_liq + 50;
            System.out.printf("O valor total de seu salário é de %.2f reais.\n", sal_liq);
        }

        scanner.close();
    }
}
