import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        // Scanner para captura de entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo as variáveis
        int quantHoras, codigo;
        char turno, categoria;
        float auxAlimentacao, salMinimo = 450, vlrHr, salInicial, salFinal;

        // Loop para calcular o salário de 10 funcionários
        for (int i = 1; i <= 10; i++) {

            // Leitura de dados do funcionário
            System.out.println("Funcionário " + i);
            System.out.print("Digite seu código: ");
            codigo = scanner.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            quantHoras = scanner.nextInt();

            // Validação do turno
            do {
                System.out.print("Digite seu turno (M. Matutino | V. Vespertino | N. Noturno): ");
                turno = scanner.next().charAt(0);
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            // Validação da categoria
            do {
                System.out.print("Digite sua categoria (G. Gerente | O. Operário): ");
                categoria = scanner.next().charAt(0);
            } while (categoria != 'O' && categoria != 'G');

            // Cálculo do salário inicial dependendo da categoria e turno
            if (categoria == 'O') {  // Se for operário
                if (turno == 'M' || turno == 'V') {
                    vlrHr = salMinimo * 0.1f;
                    salInicial = quantHoras * vlrHr;
                } else {
                    vlrHr = salMinimo * 0.13f;
                    salInicial = quantHoras * vlrHr;
                }
            } else {  // Se for gerente
                if (turno == 'M' || turno == 'V') {
                    vlrHr = salMinimo * 0.15f;
                    salInicial = quantHoras * vlrHr;
                } else {
                    vlrHr = salMinimo * 0.18f;
                    salInicial = quantHoras * vlrHr;
                }
            }

            // Cálculo do auxílio alimentação
            if (salInicial < 300) {
                auxAlimentacao = salInicial * 0.20f;
                salFinal = salInicial + auxAlimentacao;
            } else if (salInicial >= 300 && salInicial <= 600) {
                auxAlimentacao = salInicial * 0.15f;
                salFinal = salInicial + auxAlimentacao;
            } else {
                auxAlimentacao = salInicial * 0.05f;
                salFinal = salInicial + auxAlimentacao;
            }

            // Exibição da folha de pagamento
            System.out.println("___________________________________________________________");
            System.out.println("Folha de pagamento do funcionário de código " + codigo);
            System.out.println("    Número de horas trabalhadas: " + quantHoras + " horas.");
            System.out.printf("    Salário inicial: R$ %.2f.\n", salInicial);
            System.out.printf("    Auxílio alimentação: R$ %.2f.\n", auxAlimentacao);
            System.out.printf("    Salário final: R$ %.2f.\n", salFinal);

            // Reinicializando as variáveis para o próximo funcionário
            auxAlimentacao = 0;
            salFinal = 0;
            salInicial = 0;
            System.out.println();
        }

        // Fechando o scanner
        scanner.close();
    }
}
