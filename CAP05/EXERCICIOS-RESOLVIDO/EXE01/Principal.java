import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        float salario = 1000;
        float percentual = 0.015f;
        float nSalario;
        int anoAtual;

        // Exibe o salário inicial
        System.out.println("Cálculo de salário \n");
        System.out.println("Salário inicial de R$ 1000,00");
        
        // Entrada do ano atual
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        // Cálculo do novo salário
        nSalario = salario + salario * percentual;
        
        // Loop para calcular o aumento salarial a partir de 2007 até o ano atual
        for (int ano = 2007; ano <= anoAtual; ano++) {
            percentual *= 2;
            float perAumento = nSalario * percentual;
            nSalario += perAumento;
        }
        
        // Exibe o novo salário calculado
        System.out.printf("Seu novo salário será de R$ %.2f\n", nSalario);

        scanner.close();
    }
}
