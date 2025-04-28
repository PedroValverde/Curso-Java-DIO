import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        //receber as temperaturas
        for (int i=0; i<6; i++) {
            System.out.println("Digite a temperatura média de " + meses[i] + ":");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }

        // calcular média
        double soma = 0;
        for (double t : temperaturas){
            soma +=t;
        }
        
        double media = soma / temperaturas.size();
        System.out.printf("\nMédia semestral: %.2f°C\n", media);

        //mostrar temperatura acima da média
        System.out.println("\nTemperaturas acima da média:");
        for (int i= 0; i< temperaturas.size(); i++){
            if (temperaturas.get(i) > media){
                System.out.printf("%s: %.2f°C\n", meses[i], temperaturas.get(i));
            }
        }
    }

}
