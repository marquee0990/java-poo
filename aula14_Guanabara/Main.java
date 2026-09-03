package aula14_Guanabara;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        Gafanhoto g1 = new Gafanhoto("Juba", 22, "M", "juba");
        Gafanhoto g2 = new Gafanhoto  ("Creuza", 12, "F", "zinha");
        
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 10 PHP");
        v[2] = new Video("Aula 01 jk");
    }
}
