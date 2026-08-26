package aula11_Guanabara;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matrícula Cancelada");
    }

    public void setMatr(int matr){
        this.matr = matr;
    }
    public int getMatr(){
        return this.matr;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }
}
