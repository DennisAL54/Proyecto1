package sample;

public class NOT extends Compuerta {//Clase para la compuerta Not que hereda de la clase Compuerta
    public NOT(boolean ValorV, Compuerta n, ListaPrevs p) {// Constructor
        super(ValorV, n, p);
    }
    boolean prev;
}
