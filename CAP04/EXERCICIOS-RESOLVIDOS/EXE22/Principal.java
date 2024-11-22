import java.util.Scanner;

public class CalculoSalario {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis
        float salario, tempo, gratificacao, imposto;
        
        System.out.println("Cálculo de salário\n");
        
        // Leitura dos dados de entrada
        System.out.print("Digite seu salário: ");
        salario = scanner.nextFloat();
        
        System.out.print("Digite seu tempo de serviço: ");
        tempo = scanner.nextFloat();
        System.out.println();

        // 1º Bloco
        if (salario < 500) {
            if (salario < 200) {
                System.out.println("Você está isento de impostos.");
                System.out.println("Sua classificação é A");

                if (tempo > 0 && tempo < 3) {
                    gratificacao = 23;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario + gratificacao);
                } else if (tempo >= 3 && tempo < 6) {
                    gratificacao = 35;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario + gratificacao);
                } else if (tempo >= 6) {
                    gratificacao = 33;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario + gratificacao);
                }
            }

            if (salario >= 200 && salario < 450) {
                System.out.println("Sua classificação é B");

                if (tempo > 0 && tempo < 3) {
                    gratificacao = 23;
                    imposto = salario * 0.03f;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
                } else if (tempo >= 3 && tempo < 6) {
                    gratificacao = 35;
                    imposto = salario * 0.03f;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
                } else if (tempo >= 6) {
                    gratificacao = 33;
                    imposto = salario * 0.03f;
                    System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                    System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                    System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
                }
            }
        }

        // 2º Bloco
        if (salario >= 450 && salario < 500) {
            System.out.println("Sua classificação é B");

            if (tempo > 0 && tempo < 3) {
                gratificacao = 23;
                imposto = salario * 0.03f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            } else if (tempo >= 3 && tempo < 6) {
                gratificacao = 35;
                imposto = salario * 0.03f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            } else if (tempo >= 6) {
                gratificacao = 33;
                imposto = salario * 0.03f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            }
        }

        // 3º Bloco
        if (salario >= 500 && salario < 700) {
            if (salario >= 500 && salario < 600) {
                System.out.println("Sua classificação é B");
            } else {
                System.out.println("Sua classificação é C");
            }

            if (tempo > 0 && tempo < 3) {
                gratificacao = 20;
                imposto = salario * 0.08f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            } else if (tempo >= 3) {
                gratificacao = 30;
                imposto = salario * 0.08f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            }
        }

        // 4º Bloco
        if (salario >= 700) {
            System.out.println("Sua classificação é C");
            
            if (tempo > 0 && tempo < 3) {
                gratificacao = 20;
                imposto = salario * 0.12f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            } else if (tempo >= 3) {
                gratificacao = 30;
                imposto = salario * 0.12f;
                System.out.printf("Você receberá R$ %.2f de gratificação.\n", gratificacao);
                System.out.printf("Você pagará R$ %.2f de impostos.\n", imposto);
                System.out.printf("Seu salário líquido será de R$ %.2f.\n\n", salario - imposto + gratificacao);
            }
        }

        scanner.close();
    }
}
