package CursoEmVideo.Polimorfismo.Sobreposicao;

public class Canguru extends Mamifero {
    public void usarBolsa(){
        System.out.println("Filhote dentro da bolsa");
    }

    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

}
