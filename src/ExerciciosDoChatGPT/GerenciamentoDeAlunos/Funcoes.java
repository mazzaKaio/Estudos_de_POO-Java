package ExerciciosDoChatGPT.GerenciamentoDeAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    ArrayList<Aluno> listAlunos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void adicionarAluno(){
        System.out.println("--Cadastrar aluno");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        Aluno aluno = new Aluno(nome, idade);
        aluno.adicionarNotas();
        System.out.println("Aluno cadastrado!");
        System.out.println("");
    }


}
