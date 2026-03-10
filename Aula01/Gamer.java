public class Gamer {
    private String nome;
    private int pontuacao;

    public Gamer(String n, int p) {
        this.nome = n;
        this.pontuacao = p;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setPontuacao(int p) {
        this.pontuacao = p;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }
}