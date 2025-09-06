package esercizio_3;

public class MainCalcolabile {

    public static void stampaRisultato(Calcolabile c) {
        System.out.println("Risultato: " + c.calcola());
    }



    public static void main(String[] args) {
        
        Quadrato q1 = new Quadrato(10);
        Rettangolo r1 = new Rettangolo(10, 20);

        // MainCalcolabile prova1 = new MainCalcolabile();

        // prova1.stampaRisultato(q1);
        // prova1.stampaRisultato(r1);

        stampaRisultato(r1);
        stampaRisultato(q1);



    }
}
