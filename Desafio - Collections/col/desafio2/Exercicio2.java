import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);


        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };


        for(int i=0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            String resposta = scan.nextLine().toLowerCase();
            respostas.add(resposta);
        }

        long numeroDeSims = respostas.stream().filter(resposta -> resposta.equalsIgnoreCase("sim")).count();

        if(numeroDeSims == 2){
            System.out.println("Suspeita");
        } else if( numeroDeSims >= 3 && numeroDeSims <= 4 ){
            System.out.println("Cumplice");
        } else if (numeroDeSims == 5){
            System.out.println("Assasino");
        } else {
            System.out.println("inocente");
        }


    }    
}
