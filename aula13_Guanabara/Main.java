package aula13_Guanabara;

public class Main {
    public static void main(String[] args){
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir(11,45);
        c.reagir(19,4.5f);
        c.reagir(true);
    }
}
