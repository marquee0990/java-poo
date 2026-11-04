package gerhard_poo;

public class PrincipalSapato {
    public static void main(String[] args) throws InterruptedException {
        Sapato s1 = new Sapato();
        Sapato s2 = new Sapato("Nike", 43, 200);

        System.out.println("TESTANDO MÉTODOS DO SAPATO");
        Thread.sleep(2000);
        
        System.out.println("CONSTRUTOR PADRÃO DE SAPATO");
        Thread.sleep(2000);
        System.out.println(s1.toString());
        Thread.sleep(2000);

        System.out.println("MUDANDO VALORES DO CONSTRUTOR PADRÃO COM set");
        Thread.sleep(2000);
        s1.setMarca("Adidas");
        s1.setPreco(500);
        s1.setTamanho(42);
        System.out.println(s1.getMarca());
        System.out.println(s1.getPreco());
        System.out.println(s1.getTamanho());

        Thread.sleep(2000);
        System.out.println("AGORA, O CONSTRUTOR MODIFICADO");
        Thread.sleep(2000);
        System.out.println(s2.toString());
        Thread.sleep(2000);

        System.out.println("MUDANDO APENAS O NOME DA MARCA NO S2");
        Thread.sleep(2000);
        s2.setMarca("Puma");
        System.out.println(s2.getMarca());
        Thread.sleep(2000);
        System.out.println(s2.toString());
        Thread.sleep(2000);

        System.out.println("VENDO A DISPONIBILIDADE COM O PREÇO DESCONTADO (PARES = DISPONÍVEL)");
        Thread.sleep(2000);
        s1.setTamanho(42);
        s1.setPreco(500);
        s1.calcularPrecoComDesconto(50.0);
        System.out.println(s1.getPreco());

        Thread.sleep(2000);
        System.out.println("AGORA, VERIFICANDO A INDISPONILIDADE (= ÍMPAR)");
        s1.setTamanho(43);
        s1.setPreco(400);
        s1.calcularPrecoComDesconto(20.0);
        System.out.println(s1.getPreco());

        Thread.sleep(2000);

    }
}
