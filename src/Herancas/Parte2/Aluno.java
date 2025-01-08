package Herancas.Parte2;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("\nPagando mensalidade do aluno " + this.getNome());
    }

    //metodos setters e getters
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
