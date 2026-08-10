package aula01_Groner;

public class TesteCarro {
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca = "Chevrolet";
        van.modelo = "Spin";
        van.numPassageiros = 10;
        van.capComb = 100;
        van.consComb = 0.2;

        van.status();
    }

}
