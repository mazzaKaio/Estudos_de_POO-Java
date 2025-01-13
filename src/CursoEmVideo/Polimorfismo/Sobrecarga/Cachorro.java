package CursoEmVideo.Polimorfismo.Sobrecarga;

public class Cachorro extends Lobo {
    public void reagir(String frase){
        if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("ola")) {
            System.out.println("Abanando rabo e latindo");
        } else {
            System.out.println("Rosnando");
        }
    }

    public void reagir(int hora, int min){
        if (hora < 12)
            System.out.println("Abanando rabo");
        else if (hora >= 18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanando rabo e latindo");
    }

    public void reagir(boolean dono){
        if (dono)
            System.out.println("Abanando rabo");
        else
            System.out.println("Rosnando");
    }

    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10)
                System.out.println("Abanando rabo");
            else
                System.out.println("Latindo");
        } else {
            if (peso < 10)
                System.out.println("Rosnando");
            else
                System.out.println("Ignorando");
        }
    }
}
