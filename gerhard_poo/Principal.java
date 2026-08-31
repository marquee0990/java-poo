package gerhard_poo;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Sapato s1 = new Sapato();
        Sapato s2 = new Sapato("Nike", 43, 200);

        Celular c1 = new Celular();
        Celular c2 = new Celular("Iphone", "Pro Max", 15000.0, "Azul", false, 80);

        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente("Guilherme", 22, "Gripe");

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


        System.out.println("TESTANDO MÉTODOS DO CELULAR");
        Thread.sleep(2000);
        
        System.out.println("CONSTRUTOR PADRÃO DE CELULAR");
        Thread.sleep(2000);
        System.out.println(c1.toString());
        Thread.sleep(2000);

        System.out.println("MUDANDO VALORES DO CONSTRUTOR PADRÃO COM set");
        Thread.sleep(2000);
        c1.setMarca("Samsung");
        c1.setPreco(500);
        c1.setModelo("S10");
        System.out.println(c1.getMarca());
        System.out.println(c1.getPreco());
        System.out.println(c1.getModelo());

        Thread.sleep(2000);
        System.out.println("AGORA, O CONSTRUTOR MODIFICADO");
        Thread.sleep(2000);
        System.out.println(c2.toString());
        Thread.sleep(2000);


        //ATENÇÃO!!!!!!!
        System.out.println("MUDANDO APENAS O NOME DA MARCA NO C2");
        Thread.sleep(2000);
        c2.setMarca("Nokia");
        System.out.println(c2.getMarca());
        Thread.sleep(2000);
        System.out.println(c2.toString());
        Thread.sleep(2000);

        System.out.println("LIGANDO O CELULAR COM O CONSTRUTOR PADRÃO");
        Thread.sleep(2000);
        c1.setLigado(true);
        c1.ligar();
        Thread.sleep(2000);

        System.out.println("AUMENTANDO O VOLUME PARA 55");
        c1.setVolume(50);
        c1.aumentarVolume();
        System.out.println(c1.getVolume());
        Thread.sleep(2000);

        System.out.println("AGORA, DIMINUINDO PARA 50");
        c1.diminuirVolume();
        System.out.println(c1.getVolume());
        Thread.sleep(2000);

        System.out.println("CHEGANDO NA EXCESSÃO DO AUMENTAR VOLUME");
        c1.setVolume(100);
        c1.aumentarVolume();
        Thread.sleep(2000);

        System.out.println("CHEGANDO NA EXCESSÃO DO DIMINUIR VOLUME");
        c1.setVolume(0);
        c1.diminuirVolume();
        Thread.sleep(2000);

        System.out.println("TESTANDO MÉTODOS DO PACIENTE");
        Thread.sleep(2000);
        
        System.out.println("CONSTRUTOR PADRÃO DE PACIENTE");
        Thread.sleep(2000);
        System.out.println(p1.toString());
        Thread.sleep(2000);

        System.out.println("MUDANDO VALORES DO CONSTRUTOR PADRÃO COM set");
        Thread.sleep(2000);
        p1.setNome("Felipe");
        p1.setIdade(20);
        p1.setDoenca("Leptospirose");
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getDoenca());

        Thread.sleep(2000);
        System.out.println("AGORA, O CONSTRUTOR MODIFICADO");
        Thread.sleep(2000);
        System.out.println(p2.toString());
        Thread.sleep(2000);

        System.out.println("MUDANDO APENAS O NOME DO PACIENTE NO P2");
        Thread.sleep(2000);
        p2.setNome("João");
        System.out.println(p2.getNome());
        Thread.sleep(2000);
        System.out.println(p2.toString());
        Thread.sleep(2000);

        System.out.println("USANDO OS MÉTODOS E MUDANDO A DOENÇA");
        Thread.sleep(2000);
        p1.receberTratamento();
        p1.tomarRemedio();
        p1.setDoenca("Covid");
        p1.receberDiagnostico();

    }
}
