import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variáveis
        char turno, cargo;
        float salMin, salBruto, horas, vlrH, imposto, salLiq, valeAlimentacao;

        System.out.println("Cálculo de salário\n");

        // Leitura dos dados de entrada
        System.out.print("Digite o número de horas trabalhadas: ");
        horas = scanner.nextFloat();
        System.out.print("Digite o valor do salário mínimo: ");
        salMin = scanner.nextFloat();
        System.out.println();

        // Exibição da tabela de turnos
        System.out.println("Turnos de trabalho      Valor do coeficiente");
        System.out.println("  Matutino - M          10% do salário mínimo.");
        System.out.println("  Vespertino - V        15% do salário mínimo.");
        System.out.println("  Noturno - N           12% do salário mínimo.");
        System.out.println();

        // Leitura do turno
        System.out.print("Com base na tabela, digite a letra referente ao seu turno de trabalho: ");
        turno = scanner.next().charAt(0);
        System.out.println();

        // Cálculo do salário bruto baseado no turno
        switch (turno) {
            case 'm':
            case 'M':
                vlrH = salMin * 0.10f;
                salBruto = vlrH * horas;
                System.out.println("Turno matutino");
                System.out.printf("   Seu salário bruto será de R$ %.2f.\n\n", salBruto);
                break;

            case 'v':
            case 'V':
                vlrH = salMin * 0.15f;
                salBruto = vlrH * horas;
                System.out.println("Turno vespertino");
                System.out.printf("   Seu salário bruto será de R$ %.2f.\n\n", salBruto);
                break;

            case 'n':
            case 'N':
                vlrH = salMin * 0.12f;
                salBruto = vlrH * horas;
                System.out.println("Turno noturno");
                System.out.printf("   Seu salário bruto será de R$ %.2f.\n\n", salBruto);
                break;

            default:
                System.out.println("Comando inválido.\n");
                return;
        }

        // Cálculo dos impostos e gratificação
        System.out.println("Cálculo dos impostos e gratificação\n");
        System.out.println("    O - Operário");
        System.out.println("    G - Gerente\n");

        // Leitura do cargo
        System.out.print("Digite o seu cargo: ");
        cargo = scanner.next().charAt(0);

        // Cálculo de imposto para Operário
        if (cargo == 'o' || cargo == 'O') {
            if (salBruto >= 300) {
                imposto = salBruto * 0.05f;
                System.out.printf("O seu imposto será de R$ %.2f.\n", imposto);
            } else {
                imposto = salBruto * 0.03f;
                System.out.printf("O seu imposto será de R$ %.2f.\n", imposto);
            }
        }

        // Cálculo de imposto para Gerente
        if (cargo == 'g' || cargo == 'G') {
            if (salBruto >= 400) {
                imposto = salBruto * 0.06f;
                System.out.printf("O seu imposto será de R$ %.2f.\n", imposto);
            } else {
                imposto = salBruto * 0.03f;
                System.out.printf("O seu imposto será de R$ %.2f.\n", imposto);
            }
        }

        // Salário bruto após imposto
        salBruto -= imposto;

        // Cálculo de gratificação
        if (turno == 'n' || turno == 'N') {
            if (horas > 80) {
                salLiq = salBruto + 50;
                System.out.println("Gratificação: R$ 50,00");
            } else {
                salLiq = salBruto + 30;
                System.out.println("Gratificação: R$ 30,00");
            }
        } else {
            salLiq = salBruto + 30;
            System.out.println("Gratificação: R$ 30,00");
        }

        // Cálculo de vale alimentação
        if ((cargo == 'o' || cargo == 'O') && vlrH <= 25) {
            valeAlimentacao = salBruto / 3;
            System.out.printf("Vale alimentação: R$ %.2f\n", valeAlimentacao);
            salLiq += valeAlimentacao;
        }

        // Exibição do salário líquido
        System.out.printf("Seu salário líquido é R$ %.2f\n", salLiq);

        // Classificação do salário
        if (salLiq < 350) {
            System.out.println("Mal remunerado.");
        } else if (salLiq >= 350 && salLiq < 600) {
            System.out.println("Normal.");
        } else {
            System.out.println("Bem remunerado.");
        }

        scanner.close();
    }
}
