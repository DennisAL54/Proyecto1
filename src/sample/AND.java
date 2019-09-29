package sample;

public class AND extends Compuerta {// Clase para la compuerta And que hereda de la clase Compuerta
    public AND(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) {// Constructor
        super(ValorV, n, n2, p, p2);
        if (p.EncontrarFalse() == false) { // Usando el boolean de esta forma se realiza el proceso and con exito
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }
    public AND(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null, null);
    }


}
