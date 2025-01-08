package Herancas.Parte2;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerNiver(){
        System.out.println("------------------" +
                        "\nFeliz aniversário " + this.nome + "!" +
                            "------------------");
    }

    //metodos setters e getters
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

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
