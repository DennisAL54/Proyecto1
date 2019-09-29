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
        String comp;
        comp = "Compuerta";
        switch(comp){
            case "Compuerta":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    listaprevs.add(tail.DataS);
                    tail = new Compuerta(d, null,null, listaprevs, null);
                    tail.Anteriores.head.next = tail;

                }
                else{
                    head = tail = new Compuerta(d);
                }
                break;

            }
            case "And":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    listaprevs.add(tail.DataS);
                    tail = new AND(d, null,null, listaprevs, null);
                    tail.Anteriores.head.next = tail;

                }
                else{
                    head = tail = new AND(d);
                }
                break;
            }
            case "Or":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    listaprevs.add(tail.DataS);
                    tail = new OR(d, null,null, listaprevs, null);
                    tail.Anteriores.head.next = tail;

                }
                else{
                    head = tail = new OR(d);
                }
                break;
            }
            case "Not":{
                if(!vacio()){
                    tail = new NOT(d, null,null, null, tail);
                    tail.prev.next = tail;

                }
                else{
                    head = tail = new OR(d);
                }
                break;
            }
            case "Xnor":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    listaprevs.add(tail.DataS);
                    tail = new XNOR(d, null,null, listaprevs, null);
                    tail.Anteriores.head.next = tail;

                }
                else{
                    head = tail = new XNOR(d);
                }
                break;
            }
            case "Xor":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    listaprevs.add(tail.DataS);
                    tail = new XOR(d, null,null, listaprevs, null);
                    tail.Anteriores.head.next = tail;

                }
                else{
                    head = tail = new XOR(d);
                }
                break;
            }
        }
    }
    public void AñadirInicio(boolean d){
        String comp;
        comp = "Compuerta";
        switch(comp){
            case "Compuerta":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    head = new Compuerta(d, head,null, listaprevs, null);
                    head.next.Anteriores.head = tail;

                }
                else{
                    head = tail = new Compuerta(d);
                }
                break;

            }
            case "And":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    head = new AND(d, head,null, listaprevs, null);
                    head.next.Anteriores.head = tail;

                }
                else{
                    head = tail = new AND(d);
                }
                break;
            }
            case "Or":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    head = new OR(d, head,null, listaprevs, null);
                    head.next.Anteriores.head = tail;

                }
                else{
                    head = tail = new OR(d);
                }
                break;
            }
            case "Not":{
                if(!vacio()){
                    head = new NOT(d, head,null, null, null);
                    head.next.prev = head;

                }
                else{
                    head = tail = new NOT(d);
                }
                break;
            }
            case "Xnor":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    head = new XNOR(d, head,null, listaprevs, null);
                    head.next.Anteriores.head = tail;

                }
                else{
                    head = tail = new XNOR(d);
                }
                break;
            }
            case "Xor":{
                if(!vacio()){
                    ListaPrevs listaprevs = new ListaPrevs();
                    head = new XOR(d, head,null, listaprevs, null);
                    head.next.Anteriores.head = tail;

                }
                else{
                    head = tail = new XOR(d);
                }
                break;
            }
        }
    }
}
