import java.util.Scanner;

public class CalculaAcidentes {

    public static void main(String[] args) {
        // Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Dados das cidades
        int codigo, numVeic, numAcidente;
        int codigo2, numVeic2, numAcidente2;
        int codigo3, numVeic3, numAcidente3;
        int codigo4, numVeic4, numAcidente4;
        int codigo5, numVeic5, numAcidente5;

        // Índice de acidentes
        float indice1, indice2, indice3, indice4, indice5;
        float media5Cidades, mediaAcidente;

        // Coleta de dados para as 5 cidades
        System.out.println("CIDADE 1");
        System.out.print("Digite o código da cidade: ");
        codigo = scanner.nextInt();
        System.out.print("Número de veículos de passeio: ");
        numVeic = scanner.nextInt();
        System.out.print("Digite o número de acidentes de trânsito: ");
        numAcidente = scanner.nextInt();
        System.out.println("-------------------------------\n");

        System.out.println("CIDADE 2");
        System.out.print("Digite o código da cidade: ");
        codigo2 = scanner.nextInt();
        System.out.print("Número de veículos de passeio: ");
        numVeic2 = scanner.nextInt();
        System.out.print("Digite o número de acidentes de trânsito: ");
        numAcidente2 = scanner.nextInt();
        System.out.println("-------------------------------\n");

        System.out.println("CIDADE 3");
        System.out.print("Digite o código da cidade: ");
        codigo3 = scanner.nextInt();
        System.out.print("Número de veículos de passeio: ");
        numVeic3 = scanner.nextInt();
        System.out.print("Digite o número de acidentes de trânsito: ");
        numAcidente3 = scanner.nextInt();
        System.out.println("-------------------------------\n");

        System.out.println("CIDADE 4");
        System.out.print("Digite o código da cidade: ");
        codigo4 = scanner.nextInt();
        System.out.print("Número de veículos de passeio: ");
        numVeic4 = scanner.nextInt();
        System.out.print("Digite o número de acidentes de trânsito: ");
        numAcidente4 = scanner.nextInt();
        System.out.println("-------------------------------\n");

        System.out.println("CIDADE 5");
        System.out.print("Digite o código da cidade: ");
        codigo5 = scanner.nextInt();
        System.out.print("Número de veículos de passeio: ");
        numVeic5 = scanner.nextInt();
        System.out.print("Digite o número de acidentes de trânsito: ");
        numAcidente5 = scanner.nextInt();
        System.out.println("-------------------------------\n");

        // Cálculos dos índices de acidentes
        indice1 = (float) numVeic / numAcidente;
        indice2 = (float) numVeic2 / numAcidente2;
        indice3 = (float) numVeic3 / numAcidente3;
        indice4 = (float) numVeic4 / numAcidente4;
        indice5 = (float) numVeic5 / numAcidente5;

        // Verifica qual cidade tem o maior índice de acidentes
        if (indice1 > indice2 && indice1 > indice3 && indice1 > indice4 && indice1 > indice5) {
            System.out.println("A cidade 1 tem o maior índice de acidentes.");
        } else if (indice2 > indice1 && indice2 > indice3 && indice2 > indice4 && indice2 > indice5) {
            System.out.println("A cidade 2 tem o maior índice de acidentes.");
        } else if (indice3 > indice1 && indice3 > indice2 && indice3 > indice4 && indice3 > indice5) {
            System.out.println("A cidade 3 tem o maior índice de acidentes.");
        } else if (indice4 > indice1 && indice4 > indice2 && indice4 > indice3 && indice4 > indice5) {
            System.out.println("A cidade 4 tem o maior índice de acidentes.");
        } else if (indice5 > indice1 && indice5 > indice2 && indice5 > indice3 && indice5 > indice4) {
            System.out.println("A cidade 5 tem o maior índice de acidentes.");
        }

        // Cálculo da média de veículos das 5 cidades
        media5Cidades = (numVeic + numVeic2 + numVeic3 + numVeic4 + numVeic5) / 5.0f;
        System.out.printf("A média de veículos das 5 cidades somadas é de %.2f.\n", media5Cidades);

        // Cálculo da média de acidentes para cidades com menos de 2000 veículos
        if (numVeic < 2000) {
            mediaAcidente = (float) numVeic / numAcidente;
            System.out.printf("A média de acidentes da Cidade 1 é %.2f\n", mediaAcidente);
        }
        if (numVeic2 < 2000) {
            mediaAcidente = (float) numVeic2 / numAcidente2;
            System.out.printf("A média de acidentes da Cidade 2 é %.2f\n", mediaAcidente);
        }
        if (numVeic3 < 2000) {
            mediaAcidente = (float) numVeic3 / numAcidente3;
            System.out.printf("A média de acidentes da Cidade 3 é %.2f\n", mediaAcidente);
        }
        if (numVeic4 < 2000) {
            mediaAcidente = (float) numVeic4 / numAcidente4;
            System.out.printf("A média de acidentes da Cidade 4 é %.2f\n", mediaAcidente);
        }
        if (numVeic5 < 2000) {
            mediaAcidente = (float) numVeic5 / numAcidente5;
            System.out.printf("A média de acidentes da Cidade 5 é %.2f\n", mediaAcidente);
        }

        // Fecha o scanner
        scanner.close();
    }
}
