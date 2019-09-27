package sample;

public class XOR extends Compuerta {// Clase para la compuerta Xor que hereda de la clase Compuerta
    public XOR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) { //Constructor
        super(ValorV, n, n2, p);
        if(p.CompararEntradas()== true){ // usando este boolean se realiza con exito la funcion de la compuerta xor
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }


}
