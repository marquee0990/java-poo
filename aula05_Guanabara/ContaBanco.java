package aula05_Guanabara;

public class ContaBanco{
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void abrirConta(){
        setTipo(t);
        setStatus(true);

        if(t == "CC"){
            saldo = 50;
        }else if(t == "CP"){
            saldo = 150;
        }
    }
    
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta tem dinheiro.");
        }else if(saldo < 0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
        }
    }

    public void depositar(double v){
        if(status == true){
            saldo = saldo + v;
        }else{
            System.out.println("Impossível depositar.");
        }
    }

    public void sacar(double v){
        if(status == true){
            if (saldo > v) {
                saldo = saldo - v;
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossível sacar.");
        }
    }

    public void pagarMensal(){
        double v;
        if(tipo == "CC"){
            v = 12;
        }else if(tipo == "CP"){
            v = 20;
        }else{
            if(status == true){
                if (saldo > v) {
                    saldo = saldo - v;
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else{
                System.out.println("Impossível pagar");
            }
        }
    }


    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }

}