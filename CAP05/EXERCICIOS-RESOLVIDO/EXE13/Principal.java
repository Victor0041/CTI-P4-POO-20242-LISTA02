import java.util.Scanner;

public class TaxaMortalidade {

    public static void main(String[] args) {

        // Inicializando o scanner para captura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        char sexo;
        int num_crianca, tempo_vida;
        int contM = 0, contF = 0, cont_tempo = 0;
        float perc_masculino, perc_feminino, perc_tempo;

        // Entrada do número de crianças
        System.out.println("TAXA DE MORTALIDADE DE CRIANÇAS\n");
        System.out.print("Digite o número de crianças nascidas no período: ");
        num_crianca = scanner.nextInt();
        System.out.println();

        // Loop para cada criança
        for (int i = 1; i <= num_crianca; i++) {
            System.out.println(i + "º Criança");
            System.out.print("Digite o sexo da criança: ");
            sexo = scanner.next().charAt(0); // Leitura do sexo

            if (sexo == 'm' || sexo == 'M') {
                contM++;
            } else if (sexo == 'f' || sexo == 'F') {
                contF++;
            } else {
                System.out.println("Sexo inválido.");
            }

            // Entrada do tempo de vida
            System.out.print("Digite o tempo de vida (em meses): ");
            tempo_vida = scanner.nextInt();

            if (tempo_vida >= 24) {
                cont_tempo++;
            }
            System.out.println();
        }

        // Cálculo das porcentagens
        perc_masculino = (float) (contM * 100) / num_crianca;
        perc_feminino = (float) (contF * 100) / num_crianca;
        perc_tempo = (float) (cont_tempo * 100) / num_crianca;

        // Exibindo os resultados
        System.out.printf("Percentual de crianças do sexo masculino que morreram nesse período: %.1f %%.\n", perc_masculino);
        System.out.printf("Percentual de crianças do sexo feminino que morreram nesse período: %.1f %%.\n", perc_feminino);
        System.out.printf("Percentual de crianças que viveram mais de 24 meses: %.2f %%.\n", perc_tempo);

        // Fechando o scanner
        scanner.close();
    }
}
