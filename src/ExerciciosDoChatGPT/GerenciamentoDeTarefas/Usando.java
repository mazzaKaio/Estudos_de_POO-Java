package ExerciciosDoChatGPT.GerenciamentoDeTarefas;

import java.util.Scanner;

public class Usando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcoesTarefas acoes = new AcoesTarefas();
        int opcao = 0;

        do {
            System.out.println("\n=== TODOIST 2.0 ===");
            System.out.println("  [1]Adicionar tarefa");
            System.out.println("  [2]Atualizar tarefa");
            System.out.println("  [3]Listar tarefas");
            System.out.println("  [0]Sair do sistema");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    acoes.novaTarefa();
                    break;

                case 2:
                    acoes.atualizarTarefa();
                    break;

                case 3:
                    acoes.listarTarefas();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
            }

        } while (opcao != 0);
        sc.close();
    }
}
