import java.util.Scanner;

public class CalculaQuadrante {

    public static void main(String[] args) {

        // Criação do objeto Scanner para leitura de entradas
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        float angulo;
        int voltas, resto;

        // Entrada de dados
        System.out.print("Digite o valor do ângulo (em graus) e aperte Enter: ");
        angulo = scanner.nextFloat();

        // Cálculo de voltas e resto
        if (angulo > 360 || angulo < -360) {
            voltas = (int)(angulo / 360); // Cast para int para obter a parte inteira
            resto = (int)(angulo % 360);  // Resto da divisão para determinar o ângulo final
        } else {
            voltas = 0;
            resto = (int)angulo;
        }

        // Verificação se o ângulo está sobre os eixos
        if (angulo == 0 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
            System.out.println("Está sobre um desses eixos:");
        }

        // Verificação do quadrante do ângulo
        if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
            System.out.println("Primeiro Quadrante");
        } else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
            System.out.println("Segundo Quadrante");
        } else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
            System.out.println("Terceiro Quadrante");
        } else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
            System.out.println("Quarto Quadrante");
        }

        // Exibição do número de voltas e o sentido
        System.out.printf("Foram dadas %d voltas no sentido ", voltas);

        if (angulo < 0) {
            System.out.println("horário");
        } else if (angulo > 0) {
            System.out.println("anti-horário");
        } else {
            System.out.println("Não foram dadas voltas");
        }

        // Fechar o scanner após o uso
        scanner.close();
    }
}
