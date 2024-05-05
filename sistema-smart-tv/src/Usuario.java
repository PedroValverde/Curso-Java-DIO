public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligou? " + smartTv.ligada);

        for (int i = 0; i < 5; i++) {
            smartTv.abaixarVolume();
        }
        System.out.println("Volume atual? " + smartTv.volume);

        for (int i=0; i<15; i++){
            smartTv.aumentarVolume();
        }
        System.out.println("Volume atual? " + smartTv.volume);
        
        for(int i=0; i<5; i++){
            smartTv.aumentarCanal();
        }
        
        System.out.println("Canal aumentou para: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal diminuiu para: " + smartTv.canal);

        smartTv.mudarCanal(11);
        System.out.println("O novo canal é: " +smartTv.canal);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
    }
}
