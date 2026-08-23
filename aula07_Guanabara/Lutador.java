package aula07_Guanabara;

public class Lutador{
    private String nome, nacionalidade;
    private int idade;
    private double altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos.");
        System.out.println(this.getAltura() + " de altura.");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println(this.getEmpates() + " empates.");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}