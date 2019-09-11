package sample;

public class Lista {
    private Nodo head, tail; // Se crean los nodos de inicio y final
    public Lista(){
        head = tail = null;

    }
    // Para saber si la lista está vacia
    public boolean Vacio(){
        return head == null;
    }
    public void AñadirF(boolean D){
        if(!Vacio()){
            tail = new Nodo(D, null, tail);
            tail.prev.next = tail;
        }else{
            head=tail=new Nodo(D);
        }

    }
    public void AñadirI(boolean D){
        if(!Vacio()){
            head = new Nodo(D, head, null);
            head.next.prev=head;
        }else{
            head=tail=new Nodo(D);
        }
    }
}
