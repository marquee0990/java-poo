package aula09_Guanabara;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("Título do livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página atual: " + this.pagAtual);
        System.out.println("Tá aberto? " + this.aberto);
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    public Livro(String ti, String au, int tp, Pessoa le){
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tp;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = le;
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

    @Override
    public void abrir(){
        this.aberto = true;
    }

    @Override
    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void folhear(int p){
        this.pagAtual = p;
    }

    @Override
    public void avancarPag(){
        this.pagAtual++;
    }

    @Override
    public void voltarPag(){
        this.pagAtual--;
    }
}
