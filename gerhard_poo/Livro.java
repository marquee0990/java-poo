package gerhard_poo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String ti, String au, int anp){
        this.titulo = ti;
        this.autor = au;
        this.anoPublicacao = anp;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    @Override
    public String toString(){
        return "Título do livro: " + titulo + ", autor do livro: " + autor + ", ano de publicação" + anoPublicacao;
    }
}
