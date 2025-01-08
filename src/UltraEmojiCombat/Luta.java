package UltraEmojiCombat;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("\n--Luta não pode ser marcada!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {

        if (this.isAprovada()) {

            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random r = new Random();

            this.desafiado.setPontos(r.nextInt(5));
            this.desafiante.setPontos(r.nextInt(5));
            verificarCarac();

            int pontosDesafiado = this.desafiado.getPontos();
            int pontosDesafiante = this.desafiante.getPontos();

            if (pontosDesafiado > pontosDesafiante) {

                System.out.println("============");
                System.out.println(this.desafiado.getNome() + " ganhou a luta!");
                System.out.println("============");

                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();

            } else if (pontosDesafiado < pontosDesafiante) {

                System.out.println("============");
                System.out.println(this.desafiante.getNome() + " ganhou a luta!");
                System.out.println("============");

                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();

            } else {

                System.out.println("============");
                System.out.println("A luta empatou!");
                System.out.println("============");

                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();

            }

        }

    }

    public void verificarCarac() {

        // diferença de altura
        if (this.desafiado.getAltura() > this.desafiante.getAltura()) {
            this.desafiado.pontoDeVantagem();
        } else {
            this.desafiante.pontoDeVantagem();
        }

        // diferença de peso
        if (this.desafiado.getPeso() > this.desafiante.getPeso()) {
            this.desafiado.pontoDeVantagem();
        } else {
            this.desafiante.pontoDeVantagem();
        }

        // diferença de vitorias
        if (this.desafiado.getVitorias() > this.desafiante.getVitorias()) {
            this.desafiado.pontoDeVantagem();
        } else {
            this.desafiante.pontoDeVantagem();
        }

        // diferença de derrotas
        if (this.desafiado.getDerrotas() < this.desafiante.getDerrotas()) {
            this.desafiado.pontoDeVantagem();
        } else {
            this.desafiante.pontoDeVantagem();
        }

        // diferença de idade
        if (this.desafiado.getIdade() > this.desafiante.getIdade()) {
            this.desafiado.pontoDeVantagem();
        } else {
            this.desafiante.pontoDeVantagem();
        }

    }

    // métodos setters e getters
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
