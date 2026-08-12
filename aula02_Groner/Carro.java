package aula02_Groner;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capComb;
    double consComb;

    // void status(){
    //     System.out.println("ESPECIFICAÇÕS DO COMBUSTÍVEL DO CARRO:\n");
        
        
    // }

    double obterAutonomia(){
        System.out.println("Método foi chamado.");
        return capComb * consComb;
    }

}
