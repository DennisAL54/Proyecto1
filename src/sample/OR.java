package sample;

public class OR extends Compuerta {//Clase para la compuerta Or que hereda de la clase Compuerta
    public OR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) { // Constructor
        super(ValorV, n, n2, p, p2);
        if(p.EncontrarTrue() == true){ // usando este boolean se realiza el proceso or con exito
            ValorV = true;
        }
        else{
            ValorV = false;
        }
    }
    public OR(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }

}
