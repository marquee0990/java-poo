public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("ESPECIFICAÇÕES DA CANETA");
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("Uma caneta de cor " + this.cor);
        System.out.println("O tipo da ponta é " + this.ponta);
        System.out.println("A carga está em " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não pode rabiscar!");
        }else{
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
