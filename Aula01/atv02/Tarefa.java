package Aula01.atv02;

public class Tarefa {
    private int id;
    private String descricao;
    private String prioridade;
    private boolean status;


    public Tarefa(int i, String d, String p, boolean s){
        this.id = i;
        this.descricao = d;
        this.prioridade = p;
        this.status = s;
    }

    public void setId(int i){
        this.id = i;
    }

    public void setDescricao(String d){
        this.descricao = d;
    }

    public void setPrioridade(String p){
        this.prioridade = p;
    }

    public void setStatus(boolean s){
        this.status = s;
    }


    public int getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String getPrioridade(){
        return this.prioridade;
    }

    public boolean isStatus(){
        return this.status;
    }
}
