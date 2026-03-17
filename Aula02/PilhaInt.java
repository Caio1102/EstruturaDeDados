public class PilhaInt{
    private int dados[];
    private int topo;

    public PilhaInt(int capacidade){
        dados= new int[capacidade];
        topo = -1;
    }
    public boolean isEmpty(){
        return topo ==-1;
    }

    public boolean isfull(){
        return topo == dados.length -1;
    }

    public void push(int valor){
        if(isfull()){
            System.out.println("erro piha cheia");
            return;
        }
        dados[++topo]=valor;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
            return -1;
        }
        return dados[topo --];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("pilha vazia");
            return -1;
        }
        return dados[topo];
    }

    public void exibir(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
            return;
        }
        System.out.println("elementos da pilha");
        for (int i = topo; i> 0; i--){
            System.out.println(dados[i]);
        }
    }
}