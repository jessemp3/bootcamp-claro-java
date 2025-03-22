package enums;

public enum EstadoBrasileiro {
        SAO_PAULO("SP", "São Paulo"),
        RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
        MINAS_GERAIS("MG", "Minas Gerais"),
        BAHIA("BA", "Bahia"),
        RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul");

        private String sigla;
        private String nome;

        private EstadoBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }

        public String getNome() {
            return nome;
        }

        public String getNomeMaicusuclo(){
            return  this.nome.toUpperCase();
        }


}
