package lanchonete.cozinha;

public class Cozinheiro {
    Aumoxarife aumoxarife = new Aumoxarife();



    public void cozinhar() {
        System.out.println("Cozinheiro: preparando o lanche...");
    }

    public void entregar() {
        System.out.println("Cozinheiro: lanche pronto!");
    }

    public void cancelar() {
        System.out.println("Cozinheiro: cancelando o pedido...");
    }
}
