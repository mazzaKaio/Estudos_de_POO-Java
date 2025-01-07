package Objeto_Banco;

public class ContaBanco {

    public int numConta = 0;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
        numConta++;
    }

    public void abrirConta(String tipo) {
        
        this.setNumConta(numConta);
        this.setStatus(true);
        this.setSaldo(0);
        this.setTipo(tipo);

        if (this.getTipo().equalsIgnoreCase("CC")) {
            this.setSaldo(50);
        } else if (this.getTipo().equalsIgnoreCase("CP")) {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta!");
        System.out.println("Número da conta: 0" + this.getNumConta());
        
    }

    public void fecharConta() {
        
        if (this.getSaldo() > 0) {
            sacar(this.getSaldo());
            System.out.println("Saque realizado!");
            System.out.println("Conta encerrada!");
        } else {
            System.out.println("Você está em débito! Operação cancelada...");
        }

        this.setStatus(false);

    }

    public void depositar(float valorDesejado) {

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valorDesejado);
        } else {
            System.out.println("Essa conta já foi encerrada!");
        }

    }

    public void sacar(float valorDesejado)  {

        if (this.isStatus()) {
            if (this.getSaldo() > valorDesejado) {
                this.setSaldo(this.getSaldo() - valorDesejado);
                System.out.println("Saque realizado!");
                System.out.println("");
            } else {
                System.out.println("O valor desejado é maior do que o saldo!");
                System.out.println("Operação cancelada!");
                System.out.println("");
            }
        } else {
            System.out.println("A conta já foi encerrada!");
            System.out.println("");
        }

    }

    public void pagarMensalidade() {

        if (this.getTipo().equalsIgnoreCase("CC")) {
            this.setSaldo(getSaldo() - 12);
        } else if (this.getTipo().equalsIgnoreCase("CP")) {
            this.setSaldo(getSaldo() - 20);
        }

    }

    public void estadoAtual() {
        
        System.out.println("--------------------------");
        System.out.println("Conta: 0" + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("");
        
    }

    //métodos setters e getters
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }    

}