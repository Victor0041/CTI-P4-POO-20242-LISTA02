import java.util.Scanner;

public class Candidato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1, contH = 0, contF = 0, sair = 1;
        int contFMenos21 = 0, contHMais45 = 0, contHExp = 0, contFExp = 0;
        int idade, menorIdade = Integer.MAX_VALUE;
        int somaHomem = 0;

        float mediaHomem, perHomem;
        char sexo, experiencia;

        do {
            System.out.println(i + "º CANDIDATO\n");

            System.out.print("Digite seu sexo (M. Masculino | F. Feminino): ");
            sexo = scanner.next().charAt(0);

            // Sexo masculino
            if (sexo == 'M') {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                System.out.print("Você possui experiência no serviço (S. Sim | N. Não): ");
                experiencia = scanner.next().charAt(0);

                if (experiencia == 'S') {
                    somaHomem += idade;
                    contHExp++;
                }

                if (idade > 45) {
                    contHMais45++;
                }

                contH++;

            // Sexo feminino
            } else if (sexo == 'F') {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                System.out.print("Você possui experiência no serviço (S. Sim | N. Não): ");
                experiencia = scanner.next().charAt(0);

                if (experiencia == 'S') {
                    if (idade < 21) {
                        contFExp++;
                    }

                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                }

                contF++;
            }

            i++;

            System.out.print("Digite qualquer número para continuar ou 0 para sair: ");
            sair = scanner.nextInt();
            System.out.println("_____________________________________________________________");

        } while (sair != 0);

        mediaHomem = (contHExp > 0) ? (float) somaHomem / contHExp : 0;
        perHomem = (contH > 0) ? (float) contHMais45 * 100 / contH : 0;

        System.out.println("RESULTADO\n");

        // Verificar se teve candidatos do sexo masculino
        if (contH > 0) {
            System.out.println("    Total de candidatos do sexo masculino: " + contH + ".");
        } else {
            System.out.println("    Nenhum candidato do sexo masculino.");
        }

        // Verificar se teve candidatos do sexo feminino
        if (contF > 0) {
            System.out.println("    Total de candidatos do sexo feminino: " + contF + ".");
            System.out.println("    Menor idade das mulheres com experiência no serviço: " + menorIdade);
        } else {
            System.out.println("    Nenhum candidato do sexo feminino.");
        }

        // Verificar média da idade de homens com experiência no serviço
        if (contHExp > 0) {
            System.out.printf("    Média de idade de homens com experiência no serviço: %.2f.\n", mediaHomem);
        } else {
            System.out.println("    Nenhum candidato masculino com experiência no serviço.");
        }

        // Verificar quantidade de homens com mais de 45 anos
        if (contHMais45 > 0) {
            System.out.printf("    Percentual de homens com mais de 45 anos: %.2f%%.\n", perHomem);
        } else {
            System.out.println("    Nenhum candidato masculino com mais de 45 anos.");
        }

        // Verificar mulheres com menos de 21 anos com experiência no serviço
        if (contFExp > 0) {
            System.out.println("    Quantidade de mulheres com menos de 21 anos com experiência no serviço: " + contFExp + ".");
        } else {
            System.out.println("    Nenhum candidato feminino com menos de 21 anos e experiência no serviço.");
        }

        scanner.close();
    }
}
