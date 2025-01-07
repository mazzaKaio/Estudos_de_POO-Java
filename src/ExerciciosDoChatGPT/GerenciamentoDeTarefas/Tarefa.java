package ExerciciosDoChatGPT.GerenciamentoDeTarefas;

import java.time.LocalDate;

public class Tarefa {
    private static int geradorId = 0;
    private int id;
    private String descricao;
    private Status status;
    private LocalDate prazo;

    public Tarefa(String descricao, LocalDate prazo){
        this.id = ++geradorId;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
        this.prazo = prazo;
    }

    public void listar(){
        System.out.println("\nID: " + this.id +
        " | Descrição: " + this.descricao +
        " | Status: " + this.status +
        " | Prazo: " + this.prazo);
    }

    //metodos setters e getters
    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getPrazo() {
        return this.prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

}
