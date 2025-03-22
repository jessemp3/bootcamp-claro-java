package school;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); //definição de um objeto aluno

        aluno.setNome("jesse");// atribuição de valores para os atributos do objeto aluno
        aluno.setIdade(17);
        aluno.setSexo("M");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Sexo: " + aluno.getSexo());
    }
}
