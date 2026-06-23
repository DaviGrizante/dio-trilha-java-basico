import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o número da Agência!");
        String nrAgencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();


        //Exibir a mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nrAgencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
