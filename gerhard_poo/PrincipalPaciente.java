package gerhard_poo;

public class PrincipalPaciente {
    public static void main(String[] args) throws InterruptedException {
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente("Guilherme", 22, "Gripe");

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
