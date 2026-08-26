package aula11_Guanabara;

public class Main {
   public static void main(String[] args){
    Visitante v1 = new Visitante();
    v1.setNome("Fulano");
    v1.setIdade(22);
    v1.setSexo("M");

    System.out.println(v1.toString());
   } 
}
