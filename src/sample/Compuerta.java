package sample;

public class Compuerta { //Creación de la clase compuerta como un nodo

    public boolean DataS; //Datos necesarios tales como el valor de verdad y las compuerts siguiente
    Compuerta next;
    Compuerta next2;
    public ListaPrevs Anteriores;

    public Compuerta(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null);
    }
    public Compuerta(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p){//inicializado para cuando hay mas nodos

        DataS = ValorV;
        next = n;
        Anteriores = p;
        next2 = n2;

    }


}
