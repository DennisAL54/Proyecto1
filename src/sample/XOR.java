package sample;

public class XOR extends Compuerta {// Clase para la compuerta Xor que hereda de la clase Compuerta
    public XOR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) { //Constructor
        super(ValorV, n, n2, p, p2);
        if(p.CompararEntradas()== true){ // usando este boolean se realiza con exito la funcion de la compuerta xor
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }
    public XOR(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }


}
