import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ContaTermial {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o número da Agência: ");
        String Agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String NomeCliente = scanner.next();

        double Saldo = random.nextDouble(5000);

        System.out.println("Olá " + NomeCliente +", obrigado por criar uma conta em nosso banco,\n" +
                "sua agencia é " + Agencia + ", Conta " + Numero + " e seu saldo R$ " + df.format(Saldo) + " já está disponivel para saque.");
    }
}