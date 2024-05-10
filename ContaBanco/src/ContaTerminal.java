import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá! Seja bem vindo ao Banco!");

        System.out.println("Por favor, digite o Numero da Agência: ");
        int numeroAg = scanner.nextInt();

        System.out.println("Agora digite o numéro da conta com o prefixo: ");
        String conta = scanner.next();

        System.out.println("Qual o seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual valor você quer sacar? ");
        double saldo = scanner.nextDouble();

        System.out.println("Um momento por favor :)");

        System.out.println("Olá " + nome + " por criar uma conta no nosso banco, sua agência é: " + numeroAg + ", Conta" + conta + ", e seu saldo " + saldo + ", Já está disponivel para saque." );

        


        
        


    }
}
