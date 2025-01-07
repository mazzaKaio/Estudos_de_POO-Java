package Exercicios_Aula9b;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti, String au, int tP, Pessoa le){

        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tP;
        this.leitor = le;
        this.pagAtual = 0;
        this.aberto = false;

    }

    public String detalhes() {
        return "{" +
            " titulo='" + this.titulo + "'\n" +
            " autor='" + this.autor + "'\n" +
            " totPaginas='" + this.totPaginas + "'" +
            ", pagAtual='" + this.pagAtual + "'" +
            ", aberto='" + this.aberto + "'\n" +
            " leitor='" + this.leitor.getNome() + "'" +
            ", idade='"+ this.leitor.getIdade() + "'" +
            ", sexo='" + this.leitor.getSexo() + "'" +
            "}\n";
    }

    //métodos abstratos
    @Override
    public void abrir(){
        this.setAberto(true);
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(int paginaRequirida){

        if (paginaRequirida < this.totPaginas){
            this.setPagAtual(paginaRequirida);
        } else {
            this.setPagAtual(0);
        }
        
    }

    @Override
    public void avancarPag(){
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag(){
        this.setPagAtual(this.getPagAtual() - 1);
    }

    //métodos setter e getters
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

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
