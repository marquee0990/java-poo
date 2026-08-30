package gerhard_poo;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Questao06 o1 = new Questao06();
        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("VERIFICAÇÃO DE NÚMERO PAR OU ÍMPAR [Aperte ENTER para prosseguir]");
        sc.nextLine();
        System.out.println("Digite um número inteiro e verifique se ele é par ou ímpar: ");
        num1 = sc.nextInt();

        if(o1.verificarPar(num1) == true){
            System.out.println(num1 + " é par.");
        }else{
            System.out.println(num1 + " é ímpar.");
        }

        sc.close();

    }   
    
    public boolean verificarPar(int num1){
        return num1 % 2 == 0;  
    }
}
