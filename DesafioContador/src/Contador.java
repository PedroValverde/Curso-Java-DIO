import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Insira o segundo numero: ");
        int numero2 = scan.nextInt();

        try {
           contador(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }        
    }

    static void contador(int numero1, int numero2) throws ParametrosInvalidosException { 
        if(numero1 >= numero2){
           throw new ParametrosInvalidosException();
        }
        int interacoes = numero2 - numero1;
        for (int i = 0; i < interacoes; i++) {
            System.out.println("Imprimindo o numero: " + (i + 1));
        }
    }
}
