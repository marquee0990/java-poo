package aula12_Guanabara;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de bolhas");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
    
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
    public String getCorEscama(){
        return this.corEscama;
    }
}
