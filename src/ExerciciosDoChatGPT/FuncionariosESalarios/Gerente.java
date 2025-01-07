package ExerciciosDoChatGPT.FuncionariosESalarios;

public class Gerente extends Funcionario {

    public float bonusSalario(){
        float salGerente = this.getSalario() * 0.20f;
        return salGerente;
    }

}
