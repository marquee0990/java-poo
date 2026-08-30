package gerhard_poo;
import java.util.Scanner;

public class Questao1001 {
    public static void main(String[] args) {
        Questao1001 exibir = new Questao1001();
        Scanner sc = new Scanner(System.in);

        System.out.println("DESCOBRINDO O DOBRO DOS NÚMEROS [Aperte ENTER para prosseguir]");
        sc.nextLine();

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextInt();
        exibir.exibirDobro(n1);

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextInt();
        exibir.exibirDobro(n2);

        System.out.println("Digite o terceiro número: ");
        double n3 = sc.nextInt();
        exibir.exibirDobro(n3);

        sc.close();
    }

    public void exibirDobro(double num){
        System.out.println("O dobro do número digitado é: "+ num*2);
        System.out.println("Aperte ENTER para prosseguir");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

}
