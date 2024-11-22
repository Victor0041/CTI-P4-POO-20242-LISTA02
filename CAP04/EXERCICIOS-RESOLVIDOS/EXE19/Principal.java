import java.util.Scanner;

public class ClassificacaoPesoAltura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float peso, altura;

        System.out.println("Classificação de acordo com o peso e a altura\n");
        System.out.print("Digite seu peso: ");
        peso = scanner.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = scanner.nextFloat();

        if (altura < 1.20) {
            if (peso < 60) {
                System.out.println("Sua classificação é A\n");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("Sua classificação é D\n");
            } else if (peso > 90) {
                System.out.println("Sua classificação é G\n");
            }
        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso < 60) {
                System.out.println("Sua classificação é B\n");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("Sua classificação é E\n");
            } else if (peso > 90) {
                System.out.println("Sua classificação é H\n");
            }
        } else if (altura >= 1.70) {
            if (peso < 60) {
                System.out.println("Sua classificação é C\n");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("Sua classificação é F\n");
            } else if (peso > 90) {
                System.out.println("Sua classificação é I\n");
            }
        }

        scanner.close();
    }
}
