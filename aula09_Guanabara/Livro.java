package aula09_Guanabara;

public class Livro {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){

    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public Boolean getAberto(){
        return this.aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
}
