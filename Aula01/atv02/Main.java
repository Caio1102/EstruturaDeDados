package Aula01.atv02;

public class Main {
    public static void main(String[] args) {
        TarefaDAO dao = new TarefaDAO();

        dao.inserir(new Tarefa(1, "Estudar Java", "Alta", false));
        dao.inserir(new Tarefa(2, "Fazer exercicios", "Media", false));
        dao.inserir(new Tarefa(3, "Fazer mercado", "Media", true));
        dao.inserir(new Tarefa(4, "Fazer declaração imposto", "Alta", false));
        dao.inserir(new Tarefa(5, "Organizar casa", "Baixa", false));

        System.out.println("LISTA DE TAREFAS");
        System.out.println(dao);

        System.out.println("BUSCAR TAREFA PELO ID");
        Tarefa busca = dao.buscar(2);
        if(busca != null){
            System.out.println("ID: " + busca.getId() +
                    ", Descricao: " + busca.getDescricao() +
                    ", Prioridade: " + busca.getPrioridade() +
                    ", Status: " + (busca.isStatus() ? "Concluida" : "Pendente"));
        } else {
            System.out.println("Tarefa nao encontrada.");
        }

        System.out.println(" ATUALIZAR DESCRICAO DA TAREFA ID ");
        if(dao.atualizarDescricao(2, "Fazer exercicios de Java")){
            System.out.println("Descricao atualizada com sucesso.");
        } else {
            System.out.println("Nao foi possivel atualizar.");
        }

        System.out.println("MARCAR TAREFA ID COMO CONCLUIDA");
        if(dao.marcarComoConcluida(4)){
            System.out.println("Tarefa marcada como concluida.");
        } else {
            System.out.println("Nao foi possivel marcar como concluida.");
        }

        System.out.println(" REMOVER TAREFA ID ");
        Tarefa remover = dao.buscar(5);
        if(remover != null && dao.remover(remover)){
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Nao foi possivel remover.");
        }


        System.out.println(" LISTA FINAL ");
        System.out.println(dao);

        System.out.println("QUANTIDADE DE TAREFAS CONCLUIDAS");
        System.out.println(dao.contarTarefasConcluidas());

        System.out.println("TAREFAS PENDENTES");
        System.out.println(dao.listarPendentes());

        System.out.println("LISTA ORDENADA POR PRIORIDADE");
        dao.ordenarPorPrioridade();
        System.out.println(dao);
    }
}