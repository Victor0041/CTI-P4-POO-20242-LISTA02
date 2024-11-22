import java.util.Scanner;

public class MenuSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        float sal, imposto, nSal;

        // O programa será finalizado quando o usuário digitar 4 no menu de opções
        do {
            do {
                System.out.println("MENU DE OPÇÕES: ");
                System.out.println("   1. Imposto");
                System.out.println("   2. Novo salário");
                System.out.println("   3. Classificação");
                System.out.println("   4. Finalizar programa.");
                System.out.print("\nSelecione uma opção: ");
                opcao = scanner.nextInt();
                System.out.println();

                switch (opcao) {
                    case 1:
                        System.out.println("\nCálculo de impostos");
                        System.out.print("    Digite seu salário: ");
                        sal = scanner.nextFloat();

                        if (sal < 500) {
                            imposto = sal * 0.05f;
                        } else if (sal >= 500 && sal <= 850) {
                            imposto = sal * 0.10f;
                        } else if (sal > 850) {
                            imposto = sal * 0.15f;
                        }
                        System.out.printf("\nVocê pagará R$ %.2f de impostos.\n", imposto);
                        break;

                    case 2:
                        System.out.println("\nCálculo de novo salário");
                        System.out.print("    Digite seu salário: ");
                        sal = scanner.nextFloat();

                        if (sal < 450) {
                            nSal = sal + 100;
                        } else if (sal >= 450 && sal < 750) {
                            nSal = sal + 75;
                        } else if (sal >= 750 && sal <= 1500) {
                            nSal = sal + 50;
                        } else {
                            nSal = sal + 25;
                        }
                        System.out.printf("Seu novo salário será de R$ %.2f.\n", nSal);
                        break;

                    case 3:
                        System.out.println("Classificação");
                        System.out.print("    Digite seu salário: ");
                        sal = scanner.nextFloat();

                        if (sal <= 700) {
                            System.out.println("Mal remunerado.");
                        } else {
                            System.out.println("Bem remunerado.");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                System.out.println("_____________________________________________________________ \n");
            } while (opcao >= 1 && opcao <= 3);
        } while (opcao != 4);

        scanner.close();
    }
}
