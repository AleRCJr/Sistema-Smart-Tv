public class SmartTv {
    boolean ligada = false;
    int canal = 4;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        //usuario escolhe canal diretamente
    }

    public void subirCanal(){
        // canal +1
        canal ++;
        System.out.println("Mudando canal para: " + canal);
    }
    public void diminuirCamal(){
        // canal -1
        canal --;
        System.out.println("Mudando canal para: " + canal);
    }


    public void aumentarVolume(){
        // volume +1
        volume ++ ;
        System.out.println("Aumentando volume para:  " + volume);
       
    }
    public void diminuirVolume(){
        // volume -1
        volume -- ;
        System.out.println("Diminuido volume para " + volume);
        
    }
    public void ligar  (){
        ligada = true;
        // ligando a TV
    }
    public void desligar (){
        ligada = false;
        // Desligando a TV
    }
}
