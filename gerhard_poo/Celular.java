package gerhard_poo;

public class Celular {
    private String marca;
    private String modelo;
    private double preco;
    private String cor;
    private boolean ligado = true;
    private int volume;

    public Celular(){
        this.marca = "";
        this.modelo = "";
        this.preco = 0.0;
        this.cor = "";
        this.ligado = false;
        this.volume = 50;
    }
    
    public Celular(String ma, String mo, Double pre, String cor, boolean li, int vo){
        this.marca = ma;
        this.modelo = mo;
        this.preco = pre;
        this.cor = cor;
        this.ligado = li;
        this.volume = vo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return this.ligado;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }

    public void ligar(){
        if(ligado == true){
            System.out.println("Celular ligado");
        }else{
            System.out.println("Celular desligado");
        }
    }

    public void aumentarVolume(){
        if(volume == 100){
            System.out.println("Não é possível aumentar o volume.");
        }else{
            System.out.println("Aumentando volume");
            volume += 5;
        }
    }

    public void diminuirVolume(){
        if(volume == 0){
            System.out.println("Não é possível diminuir o volume.");
        }else{
            System.out.println("Diminuindo volume");
            volume -= 5;
        }
    }

    public String toString(){
        return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: " + preco + ", Cor: " + cor + ", está ligado? " + ligado + ", que volume está? " + volume;
    }
}
