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
        float prov;
        System.out.println("  --Notas do aluno");
        for (int i = 1; Notas.size() < 3; i++){
            System.out.print("  Digite a " + i + "ª nota: ");
            prov = sc.nextFloat();

            if(prov <= 10 && prov >= 0){
                Notas.add(prov);
            } else {
                System.out.println("  \nNota inserida invalida! Nao ocorreu save da nota");
                i--;
            }
        }
    }

    public void listar(){
        System.out.println("Nome: " + this.nome +
                " | Idade: " + this.idade +
                " | Matricula: " + this.matricula);
        System.out.println(" -Notas" +
                "\n 1Bi: " + this.Notas.get(0) +
                "\n 2Bi: " + this.Notas.get(1) +
                "\n 3Bi: " + this.Notas.get(2) + "\n");
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
