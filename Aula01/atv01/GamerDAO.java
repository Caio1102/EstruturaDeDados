import java.util.ArrayList;

public class GamerDAO {
    ArrayList<Gamer> jogadores = new ArrayList<>();

    public boolean inserir(Gamer g) {
        if (buscar(g.getNome()) == null) {
            int index = buscarPosInserir(g);
            if (index >= 0) {
                jogadores.add(index, g);
            } else {
                jogadores.add(g);
            }
            return true;
        }
        return false;
    }

    public int buscarPosInserir(Gamer g) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPontuacao() <= g.getPontuacao()) {
                return i;
            }
        }
        return -1;
    }

    public Gamer buscar(String n) {
        for (Gamer g : jogadores) {
            if (g.getNome().equals(n)) {
                return g;
            }
        }
        return null;
    }

    public boolean remover(Gamer g) {
        Gamer gaux = buscar(g.getNome());
        if (gaux != null) {
            jogadores.remove(gaux);
            return true;
        }
        return false;
    }

    public boolean atualizar(Gamer g) {
        Gamer gaux = buscar(g.getNome());
        if (gaux != null) {
            gaux.setNome(g.getNome());
            gaux.setPontuacao(g.getPontuacao());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String saida = "";
        for (Gamer g : jogadores) {
            saida += "Nome: " + g.getNome() +
                    ", Pontos: " + g.getPontuacao() + "\n";
        }
        return saida;
    }
}