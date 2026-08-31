package gerhard_poo;

public class Sapato {
    private String marca;
    private int tamanho;
    private double preco;

    public Sapato(){
        this.marca = "";
        this.tamanho = 0;
        this.preco = 0.0;
    }

    public Sapato(String ma, int tam, double pre){
        this.marca = ma;
        this.tamanho = tam;
        this.preco = pre;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(double porcentagemDesconto){

        if(verificarDisponibilidade() == true){
            return preco - (preco * porcentagemDesconto / 100);
        }else{
            System.out.println("Sapato indisponível");
            return 0;
        }
    }

    public boolean verificarDisponibilidade(){
        return this.getTamanho() % 2 == 0;
    }

    public String toString(){
        return "A marca do sapato: " + marca + ", tamanho: " + tamanho;
    }
}
