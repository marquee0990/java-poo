package gerhard_poo;

public class Paciente {
    //AJEITAR O SAPATO COLOCANDO O PREÇO E VERIFICAR SE PODE CRIAR MAIS DE 3 ATRIBUTOS

    private String nome;
    private int idade;
    private String doenca;

    public Paciente(){
        this.nome = "";
        this.idade = 0;
        this.doenca = "";
    }

    public Paciente(String no, int id, String doe){
        this.nome = no;
        this.idade = id;
        this.doenca = doe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setDoenca(String doenca){
        this.doenca = doenca;
    }
    public String getDoenca(){
        return this.doenca;
    }

    public void receberTratamento(){
        System.out.println("Recebe Tratamento");
    }
    public void receberDiagnostico(){
        System.out.println("Você está com: "+ this.doenca);
    }
    public void tomarRemedio(){
        System.out.println("Toma remédio");
    }


    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade + ", Doença: " + doenca;
    }
}
