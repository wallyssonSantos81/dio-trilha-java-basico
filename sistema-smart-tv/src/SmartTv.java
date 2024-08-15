public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println(" Aumentando o Canal: " +canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println(" Diminuir o Canal:" +canal);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println(" Aumentando o Volume: " +volume);  
    }
    public void baixarVolume(){
        volume--;
        System.out.println(" baixando o Volume: " +volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligada(){
        ligada=false;
    }
}