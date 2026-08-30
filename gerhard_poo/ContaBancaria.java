package gerhard_poo;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String nc, String ti){
        this.numeroConta = nc;
        this.titular = ti;
        this.saldo = 0;
    }
    public ContaBancaria(String nc, String ti, double sa){
        this.numeroConta = nc;
        this.titular = ti;
        this.saldo = sa;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public String toString(){
        return "Número da conta: " + numeroConta + ", o titular: " + titular + ", o saldo: " + saldo;
    }
}
