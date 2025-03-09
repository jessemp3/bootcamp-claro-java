public class CepFormat {
    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("00123453");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();


            return "23.765-064";
    }
}
