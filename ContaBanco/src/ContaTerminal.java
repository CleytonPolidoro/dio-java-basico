import java.util.Scanner;
import Entities.Cliente;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia,
                nomeCliente;
        double saldo;

        System.out.print("Por favor! Digite o Número da sua Agência: ");
        numero = sc.nextInt();
        System.out.println();

        System.out.print("Digite a Agência: ");
        agencia = sc.next();
        System.out.println();

        System.out.print("Digite seu nome e sobrenome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();

        System.out.println();
        System.out.print("Digite um valor de depósito inicial: R$ ");
        saldo = sc.nextDouble();
        System.out.println();

        Cliente cliente = new Cliente(numero, agencia, nomeCliente, saldo);

        System.out.println(cliente.toString());
        sc.close();
    }
}
