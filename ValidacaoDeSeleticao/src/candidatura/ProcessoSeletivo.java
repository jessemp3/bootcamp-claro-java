package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("processo seletivo");
        String [] candidatos = {"João", "Maria", "José", "Ana"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuar = true;
        boolean atendido = false;

        do{
            atendido = atender();
            continuar = !atendido;

            if(continuar){
                tentativas++;
            }else{
                System.out.println("Candidato " + candidato + " atendido na tentativa " + tentativas);
            }



        }while(continuar && tentativas < 3);
    }

    static boolean atender(){
        return  new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "José", "Ana"};

        System.out.println("Candidatos selecionados:");

        for(String candidato : candidatos){
            System.out.println(candidato);
        }
    }

    static void cancidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana"};

        int candidatosAprovados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosAprovados < 4 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatosAprovados];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " Solicitou: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("Candidato aprovado: " + candidato);
                candidatosAprovados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato e fazer proposta");
        } else {
            System.out.println("Desculpe, não podemos pagar esse valor");
        }
    }
}