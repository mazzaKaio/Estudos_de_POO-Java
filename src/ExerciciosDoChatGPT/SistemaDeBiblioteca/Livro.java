package ExerciciosDoChatGPT.SistemaDeBiblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private String disponivel;

    public void emprestar(){

        if (this.disponivel.equalsIgnoreCase("disponivel")){
            System.out.println("Empréstimo concedido!");
            this.disponivel = "emprestado";
        }

    }

    public void devolver(){

        if (this.disponivel.equalsIgnoreCase("emprestado")){
            System.out.println("Devolução concedida!");
            this.disponivel = "disponivel";
        }

    }

    public String infoLivro() {
        return "{" +
            " titulo='" + this.titulo + "'" +
            ", autor='" + this.autor + "'" +
            ", numPaginas='" + this.numPaginas + "'" +
            ", disponivel='" + this.disponivel + "'" +
            "}";
    }
    
    //métodos setters e getters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

}
