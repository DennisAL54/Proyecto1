package sample;

public class XNOR extends Compuerta {// Clase para la compuerta Xnor que hereda de la clase Compuerta
    public XNOR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) { //Constructor
        super(ValorV, n, n2, p);
        if(p.CompararEntradas() == true){ // De esta forma se cumple la funcion de la compuerta xnor
            ValorV = true;
        }
        else{
            ValorV = false;
        }
    }


}
