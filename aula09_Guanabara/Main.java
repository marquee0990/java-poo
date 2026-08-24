package aula09_Guanabara;

public class Main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Cinco Minutos", "José de Alencar", 200, p[0]);
        l[1] = new Livro("A Mão e a Luva", "Machado de Assis", 300, p[1]);

        l[0].detalhes();
    }
}
