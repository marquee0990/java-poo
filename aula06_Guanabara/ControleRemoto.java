package aula06_Guanabara;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println("Volume "+this.getVolume());
        for(int i = 0; i < this.getVolume(); i+=10){
            System.out.print("[]");
        }
    }
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }
    public void maisVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
    }
    public void menosVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    public void play(){
        if(this.getLigado() && (!this.getTocando())){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
