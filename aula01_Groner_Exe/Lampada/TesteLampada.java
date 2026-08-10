package aula01_Groner_Exe.Lampada;

public class TesteLampada {

    public static void main(String[] args){
        Lampada led = new Lampada();
        
        led.consumoEnergia = 9.0;
        led.potencia = 9.0;
        led.qtdLuz = 806.0;
        led.cor = "Branco Quente";

        led.status();
    }
    
}
