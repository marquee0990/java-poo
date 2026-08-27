package aula12_Guanabara;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo minhoca");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de piado");
    }

    public void fazerNinho(){
        System.out.println("Construir ninho");
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    public String getCorPena(){
        return this.corPena;
    }
    
}
