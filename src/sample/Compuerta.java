package sample;

public class Compuerta {

    public boolean DataS;
    Compuerta next;
    public ListaPrevs Anteriores;

    public Compuerta(boolean ValorV){
        this(ValorV, null, null);
    }
    public Compuerta(boolean ValorV, Compuerta n, ListaPrevs p){

        DataS = ValorV;
        next = n;
        Anteriores = p;

    }


}
