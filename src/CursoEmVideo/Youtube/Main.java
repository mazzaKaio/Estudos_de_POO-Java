package CursoEmVideo.Youtube;

public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Curso de Java 01");
        v[1] = new Video("Curso de Java 02");
        v[2] = new Video("Curso de Java 03");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Marcos", 14, "M", "marquinDoGrau");
        g[1] = new Gafanhoto("Joao", 28, "M", "JoaoAlmeida_");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[2] = new Visualizacao(g[1], v[0]);

        /*System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/

        vis[0].avaliar();
        vis[1].avaliar(8);
        vis[2].avaliar(100f);

        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
    }
}
