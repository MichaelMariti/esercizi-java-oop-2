package esercizio_2;

public class MainStudente {
    public static void main(String[] args) {
        


        Studente s1 = new Studente("Michael", "ABCD123");
        Studente s2 = new Studente("Mirela", "BCDE234");

        Corso corsoMatematica = new Corso("Corso di Matematica");
        Corso corsoFisica = new Corso("Corso di Fisica");

        corsoFisica.iscrivi(s1);
        corsoFisica.iscrivi(s2);

        
    }
}
