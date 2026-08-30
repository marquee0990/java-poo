package gerhard_poo;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    // Construtor padrão
    public Aluno() {
        this.nome = "Sem nome";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    // Construtor com parâmetros
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
    
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

}
