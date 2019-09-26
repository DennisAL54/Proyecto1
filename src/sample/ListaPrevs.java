package sample;

public class ListaPrevs {//Lista de compuertas previas (hecho para cuando se tienen mas de 1 entrada
    public Compuerta head; //head y tail propios de una lista
    public Compuerta tail;
    public ListaPrevs(){ // inicializado de la lista (vacia)
        head = null;
        tail = null;

    }
    public void add(boolean Data){ // método para añadir elementos (entradas) a la lista

        head = new Compuerta(Data, head, null); //Se crea una nueva compuerta como cabeza de lista y se le asigna su valor

        if(tail==null){
            tail = head;

        }
    }

}
