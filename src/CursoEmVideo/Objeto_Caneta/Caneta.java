package CursoEmVideo.Objeto_Caneta;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta (String modeloCaneta, String corCaneta, float pontaCaneta){
             
        this.modelo = modeloCaneta;
        this.cor = corCaneta;
        this.ponta = pontaCaneta;
        this.carga = 100;
        this.tampar();

    }

    public void status(){

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);

    }

    public void tampar(){

        this.tampada = true;

    }

    public void destampar(){

        this.tampada = false;

    }

    public String getModelo(){

        return this.modelo;

    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public String getCor(){

        return this.cor;

    }

    public void setCor(String c){
        this.modelo = c;
    }

}