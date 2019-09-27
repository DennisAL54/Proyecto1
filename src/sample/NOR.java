package sample;

public class NOR extends Compuerta {//Clase para la compuerta Nor que hereda de la clase Compuerta
    public NOR(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) { // Constructor
        super(ValorV, n, n2, p);
        if(p.EncontrarTrue() == true){ // Usando este boolean se realiza el proceso Nor con exito
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }

}
