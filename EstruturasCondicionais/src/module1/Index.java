package module1;

public class Index {
    public static void main(String[] args) {
        double saldo = 24.9;
        double valorSolicitado = 10.0;

        if (saldo >= valorSolicitado) {
            System.out.println("Saque realizado com sucesso!");
            saldo -= valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
