package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hi_hora, hi_min; // Hora de início
        int hf_hora, hf_min; // Hora do fim
        int tempo_inicio, tempo_final;
        float duracao;

        System.out.println("Cálculo da duração de um jogo\n");

        System.out.print("Digite a hora do início do jogo: ");
        hi_hora = scanner.nextInt();

        System.out.print("Digite os minutos do início do jogo: ");
        hi_min = scanner.nextInt();

        System.out.print("Digite a hora do final do jogo: ");
        hf_hora = scanner.nextInt();

        System.out.print("Digite os minutos do final do jogo: ");
        hf_min = scanner.nextInt();

        // Calculando os tempos em minutos desde o início do dia
        tempo_inicio = hi_hora * 60 + hi_min - 1440; // 1440 é a quantidade de minutos em um dia
        tempo_final = hf_hora * 60 + hf_min - 1440;

        // Transformando os tempos em valores positivos
        tempo_inicio = Math.abs(tempo_inicio);
        tempo_final = Math.abs(tempo_final);

        // Calculando a duração em minutos
        duracao = tempo_inicio - tempo_final;

        // Convertendo duração para horas
        duracao = duracao / 60;

        // Validando e exibindo os resultados
        if (tempo_final > tempo_inicio && duracao > 0 && duracao <= 24) {
            duracao = Math.abs(duracao); // Garantir que o valor fique positivo
            System.out.printf("\n\nO jogo teve duração de %.2f horas.\n\n", duracao);
        } else if (tempo_inicio > tempo_final && duracao > 0 && duracao <= 24) {
            System.out.printf("\n\nO jogo teve duração de %.2f horas.\n\n", duracao);
        } else {
            System.out.println("\n\nO jogo não pode ter mais que 24 horas de duração.\n\n");
        }

        scanner.close();
    }
}
