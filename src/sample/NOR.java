package sample;

public class NOR extends Compuerta {//Clase para la compuerta Nor que hereda de la clase Compuerta
    public NOR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) { // Constructor
        super(ValorV, n, n2, p, p2);
        if(p.EncontrarTrue() == true){ // Usando este boolean se realiza el proceso Nor con exito
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }
    public NOR(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }

}
