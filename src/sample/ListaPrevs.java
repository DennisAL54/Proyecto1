package sample;

public class ListaPrevs {
    public Compuerta head;
    public Compuerta tail;
    public ListaPrevs(){
        head = null;
        tail = null;

    }
    public void add(boolean Data){
        head = new Compuerta(Data, head, null);
        if(tail==null){
            tail = head;

        }
    }

}
