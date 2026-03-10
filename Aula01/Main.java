public class Main {
    public static void main(String[] args) {
        GamerDAO base = new GamerDAO();
        Gamer g1 = new Gamer("Alcides", 1000);
        if (base.inserir(g1)) {
            System.out.println("Cadastro realizado");
        } else {
            System.out.println("Erro no cadastro");
        }

        Gamer g2 = new Gamer("Joaquim", 1500);
        if (base.inserir(g2)) {
            System.out.println("Cadastro realizado");
        } else {
            System.out.println("Erro no cadastro");
        }
        System.out.println(base);
        base.remover(g1);
        System.out.println(base);
    }
}