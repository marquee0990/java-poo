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

    }
    public void desligar(){
        
    }
    public void abrirMenu(){
        
    }
    public void fecharMenu(){
        
    }
    public void maisVolume(){
        
    }
    public void menosVolume(){
        
    }
    public void ligarMudo(){
        
    }
    public void desligarMudo(){
        
    }
    public void play(){
        
    }
    public void pause(){
        
    }
}
