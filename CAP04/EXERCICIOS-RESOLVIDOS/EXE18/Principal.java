import java.util.Scanner;

public class ClassificacaoTriangulos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float l1, l2, l3, soma1, soma2, soma3;

        System.out.println("Classificação de triângulos \n");

        System.out.print("Digite o valor do primeiro lado: ");
        l1 = scanner.nextFloat();
        System.out.print("Digite o valor do segundo lado: ");
        l2 = scanner.nextFloat();
        System.out.print("Digite o valor do terceiro lado: ");
        l3 = scanner.nextFloat();
        System.out.println();

        soma1 = l1 + l2;
        soma2 = l1 + l3;
        soma3 = l2 + l3;

        if ((l1 < soma1 && l1 < soma2 && l1 < soma3) && (l2 < soma1 && l2 < soma2 && l2 < soma3) && (l3 < soma1 && l3 < soma2 && l3 < soma3)) {
            if (l1 == l2 && l1 == l3 && l2 == l3) {
                System.out.println("Triângulo equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo isósceles.");
            } else if (l1 != l2 && l1 != l3 && l2 != l3) {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é triângulo.");
        }

        scanner.close();
    }
}
