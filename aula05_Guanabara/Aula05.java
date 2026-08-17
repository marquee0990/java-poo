package aula05_Guanabara;

public class Aula05 {
    
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.estado();
    }
}
