package sample;

public class OR extends Compuerta {//Clase para la compuerta Or que hereda de la clase Compuerta
    public OR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) { // Constructor
        super(ValorV, n, n2, p);
        if(p.EncontrarTrue() == true){ // usando este boolean se realiza el proceso or con exito
            ValorV = true;
        }
        else{
            ValorV = false;
        }
    }

}
