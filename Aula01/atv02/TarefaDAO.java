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

    public int contarTarefasConcluidas(){
        int cont = 0;
        for(Tarefa t: missoes){
            if(t.isStatus()){
                cont ++;
            }
        }
        return cont;
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
