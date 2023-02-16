public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv  smartTv = new SmartTv();
        

        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("SmartTv ligada: " + smartTv.ligada);

        // smartTv.desligar();
        // System.out.println("SmartTv ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal: " + smartTv.canal);


    }
}
