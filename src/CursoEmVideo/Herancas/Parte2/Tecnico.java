package CursoEmVideo.Herancas.Parte2;

public class Tecnico extends Aluno {
    private String registroProfssional;

    public void praticar(){
        System.out.println("O aluno " + this.getNome() + " está praticando...");
    }

    //metodos setters e getters
    public String getRegistroProfssional() {
        return this.registroProfssional;
    }

    public void setRegistroProfssional(String registroProfssional) {
        this.registroProfssional = registroProfssional;
    }
}
