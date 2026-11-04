package aula14_Guanabara;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void setEspectador(Gafanhoto espectador){
        this.espectador = espectador;
    }
    public Gafanhoto getEspectador(){
        return this.espectador;
    }

    public void setFilme(Video filme){
        this.filme = filme;
    }
    public Video getFilme(){
        return this.filme;
    }
    @Override 
    public String toString(){
        return "Visualizacao " + "espectadores: " + espectador + " , filmes: " + filme; 
    }

}
