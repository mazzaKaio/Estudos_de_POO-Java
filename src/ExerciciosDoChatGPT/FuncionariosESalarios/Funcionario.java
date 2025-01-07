package ExerciciosDoChatGPT.FuncionariosESalarios;

public class Funcionario {

    private String nome;
    private String cargo;
    private float salario;

    public String infoFuncionario() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cargo='" + getCargo() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }

    public float salarioAnual(){
        float salAnual = this.salario*12;
        return salAnual;
    }

    //métodos setters e getters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
