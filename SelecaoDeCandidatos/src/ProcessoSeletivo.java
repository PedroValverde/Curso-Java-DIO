import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // selecionarCandidatos();
        // analisarCanditado(2000);
        // imprimirSelecionados();
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");    

        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatosSelecionados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

        System.out.println("Imprimindo lista de selcionados e suas indices  ");

        for (int indice = 0; indice < candidatosSelecionados.length; indice++) {
            System.err.println("O canditado de numero: " + (indice + 1) + " é o " + candidatosSelecionados[indice]);
        }

        // foreach

        for (String candidato : candidatosSelecionados) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecionarCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int cadidatoSelecionados = 0;
        int candidadoAtual = 0;
        double salarioBase = 2000.0;
        while (cadidatoSelecionados < 5 && candidadoAtual < candidatos.length) {
            String candidato = candidatos[candidadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado " + candidato + " Solicitou esse valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                cadidatoSelecionados++;
            } else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o candidato com contra proposta");
            } else {
                System.out.println("Aguardando o resultado dos demais candidatos");
            }
            candidadoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCanditado(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o cadidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }

}
