import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        try {
            display();

        } catch (Exception e) {
            System.out.printf("O segundo parâmetro deve ser maior que o primeiro%n");
            System.out.println();
            display();

        }
    }

    static void display() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = sc.nextInt();

        contar(parametroUm, parametroDois);

        sc.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}
