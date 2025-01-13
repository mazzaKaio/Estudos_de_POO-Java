package ExerciciosDoChatGPT.GerenciamentoDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AcoesTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate data = null;

    public void novaTarefa() {
        System.out.println("\n--- NOVA TAREFA ---");

        System.out.print("\n--Digite a descricao da tarefa: ");
        String descricao = sc.nextLine();

        System.out.print("--Digite o prazo para a tarefa (dd-MM-yyyy): ");
        String prazo = sc.nextLine();

        verifData(prazo, descricao);
    }

    public void listarTarefas() {
        System.out.println("\n--- LISTAGEM TAREFAS ---");
        System.out.println("-Você deseja listar: ");
        System.out.println("  [1]Todas as tarefas");
        System.out.println("  [2]Tarefas pendentes");
        System.out.println("  [3]Tarefas concluidas");
        System.out.print("--Escolha: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                listagem();
                break;

            case 2:
                for (Tarefa t : tarefas) {
                    if (t.getStatus().equals(Status.PENDENTE)) {
                        t.listar();
                    }
                }
                break;

            case 3:
                for (Tarefa t : tarefas) {
                    if (t.getStatus().equals(Status.CONCLUIDO)) {
                        t.listar();
                    }
                }
                break;

            default:
                System.out.println("Opção inexistente!");
        }
    }

    public void atualizarTarefa() {
        Tarefa atTarefa = null;

        System.out.println("\n--- ATUALIZAR TAREFA ---");
        listagem();

        do {
            System.out.print("\n--Digite o ID da tarefa que você deseja atualizar: ");
            int idTarefa = sc.nextInt();

            atTarefa = procurarTarefa(idTarefa);

            if (atTarefa == null) {
                System.out.println("Tarefa não encontrada!");
            }
        } while (atTarefa == null);

        System.out.print("--Deseja alterar a descricao da tarefa?[S/N] ");
        String confirmacao = sc.nextLine();
        sc.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            System.out.println("\n--Digite a nova descricao: ");
            String novaDescricao = sc.nextLine();
            atTarefa.setDescricao(novaDescricao);
            System.out.println("\n-Descrição atualizada!");
        }

        System.out.print("--Deseja alterar o status da tarefa?[S/N] ");
        confirmacao = sc.nextLine();
        sc.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            System.out.println("\n--Digite o novo status (pendente, em_andamento, concluido): ");
            String novoStatus = sc.nextLine().toUpperCase();
            try {
                Status novoStatusEnum = Status.valueOf(novoStatus);
                atTarefa.setStatus(novoStatusEnum);
                System.out.println("-Prazo atualizado!");
            } catch (IllegalArgumentException e) {
                System.out.println("-Status inválido! Insira: pendente, em_andamento ou concluido");
            }
        }

        System.out.print("--Deseja alterar o prazo da tarefa?[S/N] ");
        confirmacao = sc.nextLine();
        sc.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            System.out.println("\n--Digite o novo prazo (dd-MM-yyyy): ");
            String novoPrazo = sc.nextLine();

            try {
                LocalDate dataPrazo = LocalDate.parse(novoPrazo, formatter);
    
                atTarefa.setPrazo(dataPrazo);
                System.out.println("\n-Descrição atualizada!");
            } catch (DateTimeParseException e) {
                System.out.println("\n-Formato de data inserido inválido! Siga o formato correto");
            }
        }
    }

    public void deletarTarefa() {
        Tarefa rmTarefa = null;

        System.out.println("\n--- DELETAR TAREFA ---");

        for (Tarefa t : tarefas) {
            t.listar();
        }

        do {
            System.out.print("\n--Digite o ID da tarefa que você deseja excluir: ");
            int idTarefa = sc.nextInt();

            rmTarefa = procurarTarefa(idTarefa);

            if (rmTarefa != null) {
                System.out.print("--Deseja mesmo excluir essa tarefa?[S/N] ");
                String confirmacao = sc.nextLine();

                if (confirmacao.equalsIgnoreCase("s")) {
                    tarefas.remove(rmTarefa);
                    System.out.println("\n-Exclusão completa!");
                }
            } else {
                System.out.println("Tarefa não encontrada!");
            }
        } while (rmTarefa == null);
    }

    // metodos privados
    private void listagem() {
        for (Tarefa t : tarefas) {
            t.listar();
        }
    }

    private Tarefa procurarTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                System.out.println("-Tarefa encontrada!");
                return t;
            }
        }
        return null;
    }

    private void verifData(String prazo, String descricao){
        while (true)
            try {
                LocalDate dataPrazo = LocalDate.parse(prazo, formatter);

                Tarefa tarefa = new Tarefa(descricao, dataPrazo);
                tarefas.add(tarefa);

                System.out.println("\n-Tarefa cadastrada com sucesso!");
                break;
            } catch (DateTimeParseException e) {
                System.out.println("\n-Formato de data inserido inválido! Siga o formato correto");
            }
    }
}
