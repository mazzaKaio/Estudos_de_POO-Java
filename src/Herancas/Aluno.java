package Herancas;

public class Aluno extends Pessoa {

    private int matr;
    private String curso;

    public void cancelarMatr() {
        System.out.println("Matrícula cancelada! :(");
    }

    // métodos setters e getters
    public int getMatr() {
        return this.matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
