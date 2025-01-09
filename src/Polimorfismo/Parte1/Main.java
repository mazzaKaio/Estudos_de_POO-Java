package Polimorfismo.Parte1;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Canguru c = new Canguru();

        m.locomover();
        a.locomover();
        c.locomover();
    }
}
