public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume= 25;
    
    public void mudarCanal (int novoCanal){
        canal= novoCanal;

    }

    public void aumentarCanal(){
    canal++;
    
    }

    public void diminuirCanal(){
    canal--;

    }

    public void aumentarVolume(){
        volume++;
       System.out.println("Aumentando o Volume para:"+ volume);
         //volume = volume + 1;
     }

    public void diminuirVolume (){
        //volume = volume + 1;
        volume--;
        System.out.println("Diminuendo o Volume para:");
        
    }

    public void desligar (){
        ligada=false;
    }

    public void ligar() {
        ligada=true;
    }

}
