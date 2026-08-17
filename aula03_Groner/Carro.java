package aula03_Groner;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capComb;
    double consComb;

   Carro(){
    System.out.println("Classe Carro foi instanciada");
    numPassageiros = 4;
   }

   Carro(String marca_){
        marca = marca_;
   }

    double obterAutonomia(){
        System.out.println("Método foi chamado.");
        return capComb * consComb;
    }

}
