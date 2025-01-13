package CursoEmVideo.Polimorfismo.Sobreposicao;

public class Reptil extends Animal {
    private String corEscama;

    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de dinossauro");
    }

    //metodos setter e getters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
