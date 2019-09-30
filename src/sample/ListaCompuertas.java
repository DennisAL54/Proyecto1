package sample;
import javax.swing.JOptionPane; //import para el input

public class ListaCompuertas { // Clase de la lista de compuertas

    public Compuerta head, tail; // Cabeza y cola de la lista

    public ListaCompuertas(){ // Constructor nulo
        head = tail = null;
    }

    public boolean vacio(){ // Boolean que comprueba si la lista esta vacia
        return head==null;
    }
    public void AddFinal(boolean d){ // metodo para Agregar al final

        String comp;
        comp = JOptionPane.showInputDialog("Especifique Compuerta:"); //joptionpane que pide el tipo de compuerta
        switch(comp){ // Switch para los diferentes tipos de compuerta
            case "Compuerta":{ // Agregar una compuerta generica

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
            case "And":{ // Agrega compuerta And
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
            case "Or":{ //Agrega compuerta Or
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
            case "Not":{ // Agrega compuerta not
                if(!vacio()){
                    tail = new NOT(d, null,null, null, tail);
                    tail.prev.next = tail;

                }
                else{
                    head = tail = new OR(d);
                }
                break;
            }
            case "Xnor":{ // Agrega compuerta Xnor
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
            case "Xor":{ //Agrega compuerta Xor
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
    public void AddInicio(boolean d){ //Metodo para agregar al inicio de la lista
        String comp;
        comp = JOptionPane.showInputDialog("Especifique Compuerta:"); //joptionpane que pide el tipo de compuerta
        switch(comp){ //switch para cambiar los casos
            case "Compuerta":{ //agrega una compuerta generica al inicio
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
            case "And":{ //Agrega una compuerta And al inicio
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
            case "Not":{ //Agrega una compuerta Not al inicio
                if(!vacio()){
                    head = new NOT(d, head,null, null, null);
                    head.next.prev = head;

                }
                else{
                    head = tail = new NOT(d);
                }
                break;
            }
            case "Xnor":{ //Agrega una compuerta xnor al inicio
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
            case "Xor":{ //Agrega una compuerta xor al inicio
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
    public void MostrarLista(){ // Muestra  la lista en cuestion
        if (!vacio()){
            String interior = "--";
            Compuerta NAux = head;
            while(NAux!=null){
                interior = interior + "[" + NAux.DataS + "]--";
                NAux = NAux.next;
            }
            System.out.println(interior);
        }
    }
}
