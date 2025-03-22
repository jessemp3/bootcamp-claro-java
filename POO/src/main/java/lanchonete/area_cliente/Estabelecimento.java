package lanchonete.area_cliente;

import lanchonete.cozinha.Aumoxarife;
import lanchonete.cozinha.Cozinheiro;
import lanchonete.atendimento.Atendente;

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

    public static class Cliente {
        public void fazerPedido() {
            System.out.println("Cliente: fazendo o pedido...");
        }

        public void receber() {
            System.out.println("Cliente: pedido recebido!");
        }

        public void cancelar() {
            System.out.println("Cliente: cancelando o pedido...");
        }
    }
}


// 18:17