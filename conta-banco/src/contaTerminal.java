import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
         // Criação do objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicitação e leitura dos dados da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // Consome a linha pendente após a leitura do número
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final utilizando concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}

