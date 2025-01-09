package ExerciciosDoChatGPT.GerenciamentoDeAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private static int genMatricula = 0;
    private String nome;
    private int idade;
    private int matricula;
    private ArrayList<Float> Notas = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private float somaMedia;

    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.matricula = ++genMatricula;
    }

    public void adicionarNotas(){
        System.out.println("  --Notas do aluno");
        for (int i = 1; i <= 3; i++){
            System.out.print("  Digite a " + i + "ª nota: ");
            Notas.add(sc.nextFloat());
        }
    }

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMedia() {
        for (int i = 0; i < Notas.size(); i++) {
            somaMedia += Notas.get(i);
        }
        return (somaMedia/3);
    }

}
