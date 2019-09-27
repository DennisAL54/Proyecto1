package sample;

public class NOT extends Compuerta {//Clase para la compuerta Not que hereda de la clase Compuerta
    Compuerta prev; // ya que la compuerta not solo puede tener 1 prev, ese prev se representa como 1 sola compuerta

    public NOT(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) { //Constructor cuando hay mas nodos
        super(ValorV, n, n2, p);
        p2 = prev;
        if(p2.DataS == true){ // De esta forma se invierte cualquier dato que entre
            ValorV = false;
        }
        else{
            ValorV = true;
        }

    }
    public NOT(boolean ValorV){ // Constructor simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null,null);
    }
}
