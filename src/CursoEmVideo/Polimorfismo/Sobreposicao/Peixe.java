package CursoEmVideo.Polimorfismo.Sobreposicao;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plastico");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    //metodos setters e getters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
