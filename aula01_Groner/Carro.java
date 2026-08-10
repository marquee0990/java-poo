package aula01_Groner;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capComb;
    double consComb;

    void status(){
        System.out.println("ESPECIFICAÇÕS DO CARRO:\n");

        System.out.println("A marca do carro é " + this.marca);
        System.out.println("O modelo do carro é " + this.modelo);
        System.out.println("O número de passageiros permitido é " + this.numPassageiros);
        System.out.println("A capacidade máxima do combustível é " + this.capComb);
        System.out.println("O consumo do combustível é de " + this.consComb);
    }

}
