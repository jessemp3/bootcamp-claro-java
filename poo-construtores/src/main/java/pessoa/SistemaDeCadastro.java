package pessoa;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa jesse = new Pessoa("Jesse", "123.456.789-00");

        jesse.setEndereco("banharão");

        System.out.println("Nome: " + jesse.getNome() + "\nCPF: " + jesse.getCpf() + "\nEndereço: " + jesse.getEndereco());


    }
}
