package aula01_Groner.aula01_Groner_Exe.Livro;

public class Livro {
    String titulo;
    String autor;
    String sinopse;
    int anoLancamento;
    double preco;

    void status(){
        System.out.println("\nESPECIFICAÇÕES DO LIVRO!\n");

        System.out.println("O título do livro é " + this.titulo);
        System.out.println("O autor(a) do livro é " + this.autor);
        System.out.println("A sinopse do livro é " + this.sinopse);
        System.out.println("O ano de lançamento é " + this.anoLancamento);
        System.out.println("O preço do livro é " + this.preco);
    }
}
