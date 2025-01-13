package CursoEmVideo.Polimorfismo.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("ola");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(15, 4.5f);
    }
}
