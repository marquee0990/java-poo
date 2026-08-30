package gerhard_poo;
import java.util.Scanner;

public class Questao07Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VERIFICAÇÃO DA MÉDIA DAS NOTAS [Aperte ENTER para prosseguir]");
        sc.nextLine();
        System.out.println("Digite a sua primeira nota: ");
        double n1 = sc.nextInt();
        System.out.println("Digite a sua segunda nota: ");
        double n2 = sc.nextInt();
        System.out.println("Digite a sua terceira nota: ");
        double n3 = sc.nextInt();

        // double media = calculaMedia(n1, n2, n3);
        // System.out.println("A média é " + media);

        double media = calculaMedia(n1, n2, n3);
        System.out.println("A sua média é: " + media);

        sc.close();
    }

    public static double calculaMedia(double n1, double n2, double n3){
        // double media = (n1 + n2 + n3)/3;
        // return media;

        return (n1 + n2 + n3)/3;
    }
}
