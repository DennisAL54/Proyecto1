package sample;

public class NAND extends Compuerta { // Clase para la compuerta Nand que hereda de la clase Compuerta
    public NAND(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p, Compuerta p2) {
        super(ValorV, n, n2, p, p2);
        if(p.EncontrarFalse()==false){ // Usando este boolean se realiza el proceso de la compuerta nand con exito
            ValorV = true;
        }
        else{
            ValorV = false;
        }
    }
    public NAND(boolean ValorV){ // inicializado simple (Cuando no hay otros nodos)
        this(ValorV, null, null, null,null);
    }

}
