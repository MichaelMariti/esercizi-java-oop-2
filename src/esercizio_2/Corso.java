// Esercizio 2 - Interazione tra classi
// Crea due classi: `Studente` e `Corso`.
// La classe `Studente` contiene informazioni come nome e matricola.
// La classe `Corso` deve avere un metodo `iscrivi(Studente studente)` che stampa un messaggio
// come:
// `Studente Mario iscritto al corso di Matematica`.
// Questo  esercizio  serve  per  esercitarsi  con  metodi  che  ricevono  oggetti  di  classi  custom  come
// argomenti



package esercizio_2;

public class Corso {

    private String nomeCorso;

    // Costruttori - Metodi speciali
    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }


    // Metodi
    public void iscrivi(Studente studente) {
        System.out.println("Studente " + studente.getNome() + ", di matricola" + studente.getMatricola() + ", iscritto al corso di: " + this.nomeCorso);
    }

    





}
