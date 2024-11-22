import java.util.Scanner;

public class SalarioJoaoCarlos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salCarlos, salJoao;
        int meses = 0;

        System.out.print("Digite o salário de Carlos: ");
        salCarlos = scanner.nextFloat();

        // Calculando o salário inicial de João
        salJoao = salCarlos / 3;

        System.out.printf("O salário de João será de R$ %.2f.\n\n", salJoao);

        // Loop para comparar os salários de João e Carlos
        while (salJoao < salCarlos) {
            salJoao *= 1.05f;  // Aumento de 5% no salário de João
            salCarlos *= 1.02f;  // Aumento de 2% no salário de Carlos
            meses++;
        }

        System.out.printf("Levará %d meses para o salário de João igualar ao salário de Carlos.\n", meses);

        scanner.close();
    }
}
