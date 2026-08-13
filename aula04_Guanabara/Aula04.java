package aula04_Guanabara;

public class Aula04{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        
        c1.setModelo("Bic"); // = c1.modelo = "Bic" pois é publico
        c1.setPonta(0.5f);
        // c1.ponta = 0.5f; PRIVADO, por isso o set é necessário
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}