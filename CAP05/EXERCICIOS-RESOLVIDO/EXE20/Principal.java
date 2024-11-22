import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sexo;
        int quantHoras, sair;
        int contM = 0, contF = 0;
        float salBruto, salLiquidoM = 0, salLiquidoF = 0;
        float totalM = 0, totalF = 0;
        float mediaMasculino, mediaFeminino;

        System.out.println("CALCULO DE SALÁRIO\n");

        do {
            System.out.print("Digite seu sexo (M. Masculino | F. Feminino): ");
            sexo = scanner.next().charAt(0); // Captura o primeiro caractere da entrada
            System.out.println();
            System.out.print("Digite o número de horas/aula mensais: ");
            quantHoras = scanner.nextInt();

            salBruto = quantHoras * 30;

            switch (sexo) {
                case 'M':
                    salLiquidoM = salBruto - (salBruto * 0.1f);
                    System.out.printf("Salário bruto: R$ %.2f.\n", salBruto);
                    System.out.printf("Salário líquido: R$ %.2f.\n\n", salLiquidoM);
                    contM++;
                    break;

                case 'F':
                    salLiquidoF = salBruto - (salBruto * 0.05f);
                    System.out.printf("Salário bruto: R$ %.2f.\n", salBruto);
                    System.out.printf("Salário líquido: R$ %.2f.\n\n", salLiquidoF);
                    contF++;
                    break;

                default:
                    System.out.println("Sexo inválido. Tente novamente.\n");
                    continue;
            }

            totalF += salLiquidoF;
            totalM += salLiquidoM;

            System.out.print("Digite qualquer número para continuar ou 999 para encerrar: ");
            sair = scanner.nextInt();
            System.out.println("------------------------------------------------------\n");

        } while (sair != 999);

        // Condicional para sexo masculino
        if (contM == 0) {
            System.out.println("Nenhum professor do sexo masculino.");
        } else {
            mediaMasculino = totalM / contM;
            System.out.printf("Média dos salários dos professores masculinos: R$ %.2f.\n", mediaMasculino);
        }

        // Condicional para sexo feminino
        if (contF == 0) {
            System.out.println("Nenhuma professora do sexo feminino.");
        } else {
            mediaFeminino = totalF / contF;
            System.out.printf("Média dos salários das professoras femininas: R$ %.2f.\n\n", mediaFeminino);
        }

        scanner.close();
    }
}
