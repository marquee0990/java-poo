package aula14_Guanabara;

public class Video implements AcoesVideo{
    private String titulo;
    private double avaliacao;
    private double views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void setViews(double views){
        this.views = views;
    }
    public double getViews(){
        return this.views;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    public int getCurtidas(){
        return this.curtidas;
    }

    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }

    public void play(){

    }

    public void pause(){

    }

    public void like(){

    }
}
