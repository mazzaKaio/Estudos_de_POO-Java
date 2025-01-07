package ExerciciosDoChatGPT.FuncionariosESalarios;

public class Assistente extends Funcionario {

    public float bonusSalario(){
        float salAssistente = this.getSalario() * 0.10f;
        return salAssistente;
    }

}
