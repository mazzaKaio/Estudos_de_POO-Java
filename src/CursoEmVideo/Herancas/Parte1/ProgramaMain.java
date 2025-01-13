package CursoEmVideo.Herancas.Parte1;

public class ProgramaMain {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor prof = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        prof.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo('M');
        p4.setSexo('F');

        p2.setIdade(27);
        prof.setIdade(33);

        p2.setCurso("Informática");
        prof.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.dados());
        System.out.println(p2.dados());
        System.out.println(prof.dados());
        System.out.println(p4.dados());

    }
}
