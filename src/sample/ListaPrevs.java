package sample;

public class ListaPrevs {

    NodoP head;

    public void add(boolean Data){

        NodoP prev = new NodoP();
        prev.Data = Data;
        prev.next = null;

        if (head == null){
            head = prev;
        }
        else{
            NodoP n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = prev;
        }
    }

}
