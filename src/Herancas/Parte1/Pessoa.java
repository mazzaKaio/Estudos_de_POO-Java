package Herancas.Parte1;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public void fazerNiver() {

        this.idade++;
        System.out.println("-----------------------------------");
        System.out.println("Feliz aniversário " + this.nome + "!");
        System.out.println("-----------------------------------");
        
    }

    // método toString
    public String dados() {
        return "{" +
                " nome='" + this.nome + "'" +
                ", idade='" + this.idade + "'" +
                ", sexo='" + this.sexo + "'" +
                "}\n";
    }

    // métodos setter e getters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
