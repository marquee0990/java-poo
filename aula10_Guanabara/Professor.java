package aula10_Guanabara;

public class Professor extends Pessoa{
    private String espec;
    private double salario;

    public void receberAum(){}

    public void setEspec(String espec){
        this.espec = espec;
    }
    public String getEspec(){
        return this.espec;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}
