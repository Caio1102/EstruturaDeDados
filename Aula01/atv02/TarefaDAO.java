package Aula01.atv02;
import java.util.ArrayList;

public class TarefaDAO {
    ArrayList<Tarefa> missoes = new ArrayList<>();


    public void inserir(Tarefa t){
        missoes.add(t);
    }

    public Tarefa buscar(int i){
        for(Tarefa t: missoes){
            if(t.getId() == i) {
                return t;
            }
        }
        return null;
    }

    public boolean remover(Tarefa t){
        Tarefa taux = buscar(t.getId());
        if(taux != null){
            missoes.remove(taux);
            return true;
        }
        return false;
    }




    public boolean atualizar(Tarefa t){
        Tarefa taux = buscar(t.getId());
        if(taux != null){
            taux.setId(t.getId());
            taux.setDescricao(t.getDescricao());
            taux.setPrioridade(t.getPrioridade());
            taux.setStatus(t.isStatus());
            return true;
        }
        return false;
    }

    public boolean atualizarDescricao(int id, String novaDescricao){
        Tarefa t = buscar(id);
        if(t != null){
            t.setDescricao(novaDescricao);
            return true;
        }
        return false;
    }

    public boolean marcarComoConcluida(int id){
        Tarefa t = buscar(id);
        if(t != null){
            t.setStatus(true);
            return true;
        }
        return false;
    }

    public int contarTarefasConcluidas(){
        int cont = 0;
        for(Tarefa t: missoes){
            if(t.isStatus()){
                cont ++;
            }
        }
        return cont;
    }


    public String listarPendentes(){
        String saida = "";
        for(Tarefa t : missoes){
            if(!t.isStatus()){
                saida += "ID: " + t.getId() +
                        ", Descricao: " + t.getDescricao() +
                        ", Prioridade: " + t.getPrioridade() +
                        ", Status: Pendente\n";
            }
        }
        return saida;
    }

    public void ordenarPorPrioridade(){
        for(int i = 0; i < missoes.size() - 1; i++){
            for(int j = i + 1; j < missoes.size(); j++){
                if(valorPrioridade(missoes.get(i).getPrioridade()) > valorPrioridade(missoes.get(j).getPrioridade())){
                    Tarefa aux = missoes.get(i);
                    missoes.set(i, missoes.get(j));
                    missoes.set(j, aux);
                }
            }
        }
    }

    private int valorPrioridade(String prioridade){
        if(prioridade.equalsIgnoreCase("Alta")){
            return 1;
        } else if(prioridade.equalsIgnoreCase("Media") || prioridade.equalsIgnoreCase("Média")){
            return 2;
        } else if(prioridade.equalsIgnoreCase("Baixa")){
            return 3;
        }
        return 4;
    }



    public String toString(){
        String saida ="";
        for(Tarefa t : missoes){
            saida += "ID: " + t.getId()+
                    ", Descricao: " + t.getDescricao() + 
                    ", Prioridade: " + t.getPrioridade()+
                    ", Status: " + t.isStatus()+ "\n";
        }
        return saida;
    }

}
