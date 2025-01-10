package ExerciciosDoChatGPT.GerenciamentoDeAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    private ArrayList<Aluno> listAlunos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void adicionarAluno(){
        System.out.println("--Cadastrar aluno");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Aluno aluno = new Aluno(nome, idade);
        aluno.adicionarNotas();
        listAlunos.add(aluno);
        System.out.println("Aluno cadastrado!");
        System.out.println("");
    }

    public void listarAlunos(){
        for (Aluno a: listAlunos){
            a.listar();
        }
    }
}
