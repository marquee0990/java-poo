package gerhard_poo;

public class Questao0802main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno("Thiago", 10, 9);

        aluno.setNome("Big Gui");
        aluno.setNota1(8);
        aluno.setNota2(9);

        System.out.println("A média de " +aluno.getNome() +" é: "+ aluno.calcularMedia());
        System.out.println("A média de " + aluno2.getNome() + " é: " + aluno2.calcularMedia());

    }
}
