package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e:EstadoBrasileiro.values()){ // listagem para percorer o enum e listar tudo que tem dentro dele
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO; // pegando um valor especifico do enum

        System.out.println(eb.getNomeMaicusuclo());
    }
}
