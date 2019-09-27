package sample;

public class ListaPrevs {//Lista de compuertas previas (hecho para cuando se tienen mas de 1 entrada
    public Compuerta head; //head y tail propios de una lista
    public Compuerta tail;
    public ListaPrevs(){ // inicializado de la lista (vacia)
        head = null;
        tail = null;

    }
    public void add(boolean Data){ // método para añadir elementos (entradas) a la lista

        head = new Compuerta(Data, null, head, null); //Se crea una nueva compuerta como cabeza de lista y se le asigna su valor

        if(tail==null){
            tail = head;

        }
    }
    public boolean EncontrarFalse(){ // metodo para encontrar un valor false entre las entradas
        Compuerta Ref = head;
        boolean HayF;
        HayF = true;
        while(Ref!=null){
            if(Ref.DataS == false){
                HayF = false;
                Ref = Ref.next2;
            }
            else{
                Ref = Ref.next2;
            }
        }
        return HayF;


    }
    public boolean EncontrarTrue() { // metodo para encontrar un valor true entre las entradas
        Compuerta Ref = head;
        boolean HayT;
        HayT = false;
        while (Ref != null) {
            if (Ref.DataS == true) {
                HayT = true;
                Ref = Ref.next2;
            } else {
                Ref = Ref.next2;
            }
        }
        return HayT;
    }

    public boolean CompararEntradas(){
        Compuerta Ref1 = head;
        Compuerta Ref2 = head.next2;
        boolean TDif;
        TDif = false;
        while(Ref2 != null){
            if(Ref2.DataS != Ref1.DataS){
                TDif = true;
                Ref2 = Ref2.next2;

            }
            else{
                Ref2 = Ref2.next;

            }
        }
        return TDif;
    }
}
