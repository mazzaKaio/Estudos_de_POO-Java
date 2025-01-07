package ExerciciosDoChatGPT.FuncionariosESalarios;

public class Gerenciamento {
    public static void main(String[] args) {
        
        Funcionario p1 = new Funcionario();
        p1.setCargo("Estoque");
        p1.setNome("Carlos");
        p1.setSalario(1872.70f);
        System.out.println(p1.infoFuncionario() + "\n Salário anual: " + p1.salarioAnual());

    }
}
