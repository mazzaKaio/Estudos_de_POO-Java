package CursoEmVideo.Youtube;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + this.login + '\'' +
                ", totAssistido=" + this.totAssistido +
                ", nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", sexo='" + this.sexo + '\'' +
                ", experiencia=" + this.experiencia +
                '}';
    }

    //setters e getters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
