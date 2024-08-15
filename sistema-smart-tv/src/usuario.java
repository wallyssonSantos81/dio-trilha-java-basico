public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ->TV esta ligada? " + smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo Status ->TV esta ligada? " + smartTv.ligada);


    }
}
