import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando conta bancária");

        // Captura o número da conta
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        
        // Limpa o buffer do Scanner após ler o número da conta
        scanner.nextLine(); 

        // Captura o número da agência
        System.out.println("Digite o número da agência (123-x):");
        agencia = scanner.nextLine();

        // Captura o nome do cliente
        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();

        // Captura o saldo atual
        System.out.println("Saldo atual:");
        saldo = scanner.nextDouble();

        // Exibe as informações
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); // Fecha o scanner para liberar os recursos
    }
}
