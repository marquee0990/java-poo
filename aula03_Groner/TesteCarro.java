package aula03_Groner;

public class TesteCarro {
    public static void main(String[] args) {
        Carro sonic = new Carro();
        sonic.marca = "Chevrolet";
        sonic.modelo = "Sonic";
        //sonic.numPassageiros = 5;
        sonic.capComb = 200;
        sonic.consComb = 3.2;

        System.out.println(sonic.numPassageiros);
        
        Carro fat = new Carro("Chevrolet");
        fat.modelo = "Classic";
        
        System.out.println(fat.marca);

    }
}
