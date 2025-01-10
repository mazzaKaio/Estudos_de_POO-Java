package Polimorfismo.Sobreposicao;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu");
    }

    //metodos setters e getters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
