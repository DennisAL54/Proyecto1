package sample;

public class Nodo {
    public boolean Data;
    Nodo next, prev;

    public Nodo(boolean Da, Nodo N, Nodo P){ // Constructor para cuando hay nodos
        Data = Da;
        next = N;
        prev = P;
    }
    public Nodo(boolean Da){ // Constructor para cuando no hay nodos
        this(Da, null, null);
    }

}
