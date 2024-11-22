import java.util.Scanner;

public class CalculoValoresTransporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codEstado, codCarga;
        float imposto, pesoT, pesoKg, preco;

        System.out.println("Cálculo de valores do transporte\n");

        System.out.print("Digite o peso da carga em toneladas: ");
        pesoT = scanner.nextFloat();

        System.out.print("Digite o código do estado de origem (1 a 5): ");
        codEstado = scanner.nextInt();

        System.out.print("Digite o código da carga de origem (10 a 40): ");
        codCarga = scanner.nextInt();

        System.out.println();

        switch (codEstado) {
            case 1:
                System.out.println("ESTADO 1\n");
                pesoKg = pesoT * 1000;
                System.out.printf("O peso da carga em quilos é %.2f kg\n", pesoKg);

                if (codCarga >= 10 && codCarga <= 20) {
                    preco = pesoKg * 100;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.35);
                } else if (codCarga > 20 && codCarga <= 30) {
                    preco = pesoKg * 250;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.35);
                } else if (codCarga > 30 && codCarga <= 40) {
                    preco = pesoKg * 340;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.35);
                }
                break;

            case 2:
                System.out.println("ESTADO 2\n");
                pesoKg = pesoT * 1000;
                System.out.printf("O peso da carga em quilos é %.2f kg\n", pesoKg);

                if (codCarga >= 10 && codCarga <= 20) {
                    preco = pesoKg * 100;
                    imposto = preco * 0.25;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.25);
                } else if (codCarga > 20 && codCarga <= 30) {
                    preco = pesoKg * 250;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.25);
                } else if (codCarga > 30 && codCarga <= 40) {
                    preco = pesoKg * 340;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.25);
                }
                break;

            case 3:
                System.out.println("ESTADO 3\n");
                pesoKg = pesoT * 1000;
                System.out.printf("O peso da carga em quilos é %.2f kg\n", pesoKg);

                if (codCarga >= 10 && codCarga <= 20) {
                    preco = pesoKg * 100;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.15);
                } else if (codCarga > 20 && codCarga <= 30) {
                    preco = pesoKg * 250;
                    imposto = preco * 0.15;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.15);
                } else if (codCarga > 30 && codCarga <= 40) {
                    preco = pesoKg * 340;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.15);
                }
                break;

            case 4:
                System.out.println("ESTADO 4\n");
                pesoKg = pesoT * 1000;
                System.out.printf("O peso da carga em quilos é %.2f kg\n", pesoKg);

                if (codCarga >= 10 && codCarga <= 20) {
                    preco = pesoKg * 100;
                    imposto = preco * 0.055;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.05);
                } else if (codCarga > 20 && codCarga <= 30) {
                    preco = pesoKg * 250;
                    imposto = preco * 0.15;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.05);
                } else if (codCarga > 30 && codCarga <= 40) {
                    preco = pesoKg * 340;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.05);
                }
                break;

            case 5:
                System.out.println("ESTADO 5\n");
                pesoKg = pesoT * 1000;
                System.out.printf("O peso da carga em quilos é %.2f kg\n", pesoKg);

                if (codCarga >= 10 && codCarga <= 20) {
                    preco = pesoKg * 100;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.println("Não será cobrado impostos.");
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco);
                } else if (codCarga > 20 && codCarga <= 30) {
                    preco = pesoKg * 250;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.println("Não será cobrado impostos.");
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco);
                } else if (codCarga > 30 && codCarga <= 40) {
                    preco = pesoKg * 340;
                    imposto = preco * 0.35;
                    System.out.printf("O preço da carga será de R$ %.2f\n", preco);
                    System.out.printf("Será cobrado R$ %.2f de impostos\n", imposto);
                    System.out.printf("O valor total do transporte será de R$ %.2f.\n\n", preco * 1.15);
                }
                break;

            default:
                System.out.println("Código de estado inválido.");
        }

        scanner.close();
    }
}
