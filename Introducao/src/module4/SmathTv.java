package module4;

public class SmathTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;


        public void ligar(){
            ligada = true;
                System.out.println("A TV está ligada");
        }

        public void desligar(){
            ligada = false;
                System.out.println("A TV está desligada");
        }

        public void aumentarVolume(){
            volume++;
                System.out.println("Volume: " + volume);
        }

        public void diminuirVolume(){
            volume--;
                System.out.println("Volume: " + volume);
        }

        public void trocarCanal(int novoCanal){
            canal = novoCanal;
                System.out.println("Canal: " + canal);
        }

}
