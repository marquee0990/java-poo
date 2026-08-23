package aula07e08_Guanabara;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
       if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
       }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
       }
    }
    public void lutar(){
        if(this.getAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random al = new Random();

            int vencedor = al.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();;
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds(){
        return this.rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}
