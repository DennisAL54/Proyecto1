package sample;

public class NAND extends Compuerta { // Clase para la compuerta Nand que hereda de la clase Compuerta
    public NAND(boolean ValorV, Compuerta n, Compuerta n2, ListaPrevs p) {
        super(ValorV, n, n2, p);
        if(p.EncontrarFalse()==false){ // Usando este boolean se realiza el proceso de la compuerta nand con exito
            ValorV = true;
        }
        else{
            ValorV = false;
        }
    }

}
