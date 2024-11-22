public class Fibonacci {

    public static void main(String[] args) {

        // Definindo as variáveis
        int num1 = 0, num2 = 1, sequencia;

        // Calculando e exibindo a sequência de Fibonacci de 3 até 10
        for (int i = 3; i <= 10; i++) {
            sequencia = num1 + num2;

            // Imprimindo o valor da sequência
            System.out.println(sequencia);

            // Atualizando os valores de num1 e num2
            num1 = num2;
            num2 = sequencia;
        }
    }
}
