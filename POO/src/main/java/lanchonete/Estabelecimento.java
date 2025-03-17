package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Atendente atendente = new Atendente();
        Aumoxarife aumoxarife = new Aumoxarife();
        Cozinheiro cozinheiro = new Cozinheiro();

        cliente.fazerPedido();
        atendente.anotarPedido();
        aumoxarife.buscar();
        aumoxarife.entregar();
        cozinheiro.cozinhar();
        cozinheiro.entregar();
        atendente.entregar();
        cliente.receber();
    }
}


// 18:17