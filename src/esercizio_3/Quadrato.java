package esercizio_3;

public class Quadrato implements Calcolabile{


    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }


    
    @Override
    public int calcola() {
        return lato * lato;
    }

}
