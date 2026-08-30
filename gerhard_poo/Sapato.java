package gerhard_poo;

public class Sapato {
    private String marca;
    private int tamanho;

    public Sapato(){
        this.marca = "";
        this.tamanho = 0;
    }

    public Sapato(String ma, int tam){
        this.marca = ma;
        this.tamanho = tam;
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

    public double calcularPrecoComDesconto(double porcentagemDesconto){

        if(verificarDisponibilidade() == true){
            double valorSapato = 0;
            return valorSapato - (valorSapato * porcentagemDesconto / 100);
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
