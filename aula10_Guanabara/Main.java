package aula10_Guanabara;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario f1 = new Funcionario();

        p1.setNome("Pedro");
        a1.setNome("Maria");
        p2.setNome("Cláudio");
        f1.setNome("Fabiana");

        a1.setSexo("F");

        f1.setSetor("Estoque");

        System.out.println(p1.toString());
    }
    
}
