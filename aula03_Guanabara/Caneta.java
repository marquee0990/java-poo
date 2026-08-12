package aula03_Guanabara;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("ESPECIFICAÇÕES DA CANETA");
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("Uma caneta de cor " + this.cor);
        System.out.println("O tipo da ponta é " + this.ponta);
        System.out.println("A carga está em " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não pode rabiscar!");
        }else{
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
