package CursoEmVideo.Objeto_Banco;

public class CriarConta {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono("Creusa");
        p2.abrirConta("cP");
        p2.depositar(500);
        p2.estadoAtual();
    }
}
