package sample;

public class Compuerta { //Creación de la clase compuerta como un nodo

    public boolean DataS; //Datos necesarios tales como el valor de verdad y las compuerts siguiente
    Compuerta next; // Se necesitan 2 next, debido a que los nodos anteriores se manejan con una lista enlazada, la cual requiere su propio next
    Compuerta next2;
    Compuerta prev; // ya que la compuerta not solo puede tener 1 prev, ese prev se representa como 1 sola compuerta
    public ListaPrevs Anteriores;

    public Compuerta(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }
    public Compuerta(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2){//inicializado para cuando hay mas nodos

        DataS = ValorV; //Valor de verdad de cada compuerta
        next = n;// Nodo o compuerta siguiente
        Anteriores = p; // Lista de elementos anteriores
        next2 = n2;// nodo next2
        prev = p2; // nodo prev 2

    }


}
