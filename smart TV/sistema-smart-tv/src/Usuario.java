public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
            System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Volume atual : " + smartTv.volume);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.diminuirCamal();
        smartTv.mudarCanal(9);
            System.out.println("O canal atual é -> " + smartTv.canal);
        

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
            System.out.println("Novo Status de volume -> " + smartTv.volume);


        
    }
}
