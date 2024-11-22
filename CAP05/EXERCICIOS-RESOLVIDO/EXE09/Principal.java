import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {

        // Criando o scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Definindo as variáveis
        float n1, n2, media, mediaTurma = 0;
        int contAprovado = 0, contExame = 0, contRep = 0;

        System.out.println("Cálculo de média de alunos\n");

        // Laço para calcular a média dos alunos
        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno " + i);

            System.out.print("Digite a primeira nota: ");
            n1 = scanner.nextFloat();

            System.out.print("Digite a segunda nota: ");
            n2 = scanner.nextFloat();

            // Calculando a média
            media = (n1 + n2) / 2;
            mediaTurma += media; // Somando a média da turma

            // Verificando a situação do aluno
            if (media < 3) {
                System.out.println("Você foi reprovado\n");
                contRep++;
            } else if (media >= 3 && media <= 7) {
                System.out.println("Você está em exame.\n");
                contExame++;
            } else {
                System.out.println("Você foi aprovado.\n");
                contAprovado++;
            }
        }

        // Calculando a média da turma
        mediaTurma = mediaTurma / 6;

        // Exibindo os resultados
        System.out.println("Total de alunos reprovados: " + contRep);
        System.out.println("Total de alunos em exame: " + contExame);
        System.out.println("Total de alunos aprovados: " + contAprovado);
        System.out.printf("A média da turma é de %.2f pontos.\n", mediaTurma);

        // Fechando o scanner
        scanner.close();
    }
}
