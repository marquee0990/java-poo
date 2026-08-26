package aula11_Guanabara;

public class Bolsista extends Aluno{
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }

    public void cancelarMatr(){
        System.out.println("Cancelando");
    }

    public void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }
    public double getBolsa(){
        return this.bolsa;
    }
}
