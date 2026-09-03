package aula14_Guanabara;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public void viuMaisUm(){
        totAssistindo += totAssistindo;
    }

    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
    }

    public void setTotAssistindo(int totAssistindo){
        this.totAssistindo = totAssistindo;
    }
    public int getTotAssistindo(){
        return this.totAssistindo;
    }
}
