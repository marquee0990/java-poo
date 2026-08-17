package aula05_Guanabara;

public class ContaBanco{
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estado(){
        System.out.println(this.getNumConta());
        System.out.println(this.getDono());
        System.out.println(this.getTipo());
        System.out.println(this.getSaldo());
        System.out.println(this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta tem dinheiro.");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(double v){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado.");
        }else{
            System.out.println("Impossível depositar.");
        }
    }

    public void sacar(double v){
        if(this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado.");
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Impossível sacar.");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }else{
            if(this.getStatus()){
                if (this.getSaldo() > v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Mensalidade paga.");
                }else{
                    System.out.println("Saldo insuficiente.");
                }
            }else{
                System.out.println("Impossível pagar");
            }
        }
    }

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
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