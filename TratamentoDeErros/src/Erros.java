import java.util.InputMismatchException;
import  java.util.Scanner;
import  java.util.Locale;

public class Erros {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite seu nome: ");
            String nome = scaner.next();

            System.out.println("digite seu sobrenome: ");
            String sobrenome = scaner.next();

            System.out.println("digite sua idade:");
            int idade = scaner.nextInt();

            System.out.println("digite sua altura:");
            double altura = scaner.nextDouble();

            scaner.close();
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura devem ser números");
        };
    }
}
