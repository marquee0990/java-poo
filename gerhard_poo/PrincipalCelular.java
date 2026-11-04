package gerhard_poo;

public class PrincipalCelular {
    public static void main(String[] args) throws InterruptedException {
        Celular c1 = new Celular();
        Celular c2 = new Celular("Iphone", "Pro Max", 15000.0, "Azul", false, 80);

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


        
        System.out.println("MUDANDO APENAS O NOME DA MARCA NO C2");
        Thread.sleep(2000);
        c2.setMarca("Nokia");
        System.out.println(c2.getMarca());
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
    }
}
