package sample;

public class ListaCompuertas {
    AND and;
    OR or;
    NAND nand;
    NOR nor;
    NOT not;
    XOR xor;
    XNOR xnor;

    public Compuerta head, tail;

    public ListaCompuertas(){
        head = tail = null;
    }

    public boolean vacio(){
        return head==null;
    }
    public void AñadirFinal(boolean d){
        if(!vacio()){
            ListaPrevs listaprevs = new ListaPrevs();
            listaprevs.add(tail.DataS);
            tail = new Compuerta(d, null, listaprevs);
            tail.Anteriores.head.next = tail;

        }
    }
}
