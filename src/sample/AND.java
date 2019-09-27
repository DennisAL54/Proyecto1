package sample;

public class AND extends Compuerta {// Clase para la compuerta And que hereda de la clase Compuerta
    public AND(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) {// Constructor
        super(ValorV, n, n2, p);
        if (p.EncontrarFalse() == false) { // Usando el boolean de esta forma se realiza el proceso and con exito
            ValorV = false;
        }
        else{
            ValorV = true;
        }
    }


}
