package sample;

public class NOT extends Compuerta {//Clase para la compuerta Not que hereda de la clase Compuerta

    public NOT(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) { //Constructor cuando hay mas nodos
        super(ValorV, n, n2, p, p2);
        prev = p2;
        if(p2.DataS == true){ // De esta forma se invierte cualquier dato que entre
            ValorV = false;
        }
        else{
            ValorV = true;
        }

    }
    public NOT(boolean ValorV){ // Constructor simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }
}
