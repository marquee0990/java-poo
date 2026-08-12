package aula01_Groner.aula01_Groner_Exe.Livro;

public class LivroDeLivraria{
    public static void main(String[]args){
        Livro bladeRunner = new Livro();
        bladeRunner.titulo = "Androids Sonham com Ovelhas Elétricas";
        bladeRunner.anoLancamento = 1964;
        bladeRunner.autor = "Phillip K. Dick";
        bladeRunner.sinopse = "lorem ipsofm";
        bladeRunner.preco = 120;
        
        bladeRunner.status();
    }
}