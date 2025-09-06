package esercizio_3;

public class Rettangolo implements Calcolabile{

    private int base;

    private int altezza;




    public Rettangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public int calcola() {
        return base * altezza;
    }

}
