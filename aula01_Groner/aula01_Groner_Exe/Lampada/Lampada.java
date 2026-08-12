package aula01_Groner.aula01_Groner_Exe.Lampada;

public class Lampada {
    double consumoEnergia;
    double potencia;
    double qtdLuz;
    String cor;

    void status(){
        System.out.println("\n ESPECIFICAÇÕES DA LÂMPADA! \n");
        System.out.println("Consumo é de " + this.consumoEnergia);
        System.out.println("A potência da luz é de " + this.potencia);
        System.out.println("A quantidade da luz é de " + this.qtdLuz);
        System.out.println("A cor da luz é " + this.cor);
    }
}
