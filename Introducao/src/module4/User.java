package module4;

public class User {
    public static void main(String[] args) {
        SmathTv smathTv = new SmathTv();

        System.out.println(smathTv.ligada);
        System.out.println(smathTv.canal);
        System.out.println(smathTv.volume);


        smathTv.ligar();
        smathTv.aumentarVolume();
        smathTv.trocarCanal(12);
    }
}
