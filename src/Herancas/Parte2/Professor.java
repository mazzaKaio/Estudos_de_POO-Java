package Herancas.Parte2;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float valor){
        System.out.println("Parábens " + this.getNome() + "! Você recebeu um aumento de " + valor);
        System.out.println("Seu salário era " + this.getSalario() + " , mas, agora será " + this.getSalario() + valor);
        this.setSalario(this.getSalario() + valor);
    }

    //metodos setters e getters
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
