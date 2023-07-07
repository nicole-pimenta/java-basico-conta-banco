import java.util.Scanner; 
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Por favor, digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo");
        String saldo = scanner.next();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + "," +
        "obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta +
         "e seu saldo "+ saldo + "já está disponível para saque !!!");

        scanner.close();      
    }
}
