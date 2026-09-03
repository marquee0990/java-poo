package aula14_Guanabara;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected void ganharExp(){
        experiencia += experiencia;
    }

    //GETTERS E SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }

    public void setExperiencia(double experiencia){
        this.experiencia = experiencia;
    }
    public double getExperiencia(){
        return this.experiencia;
    }
}
