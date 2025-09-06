// Esercizio 2 - Interazione tra classi
// Crea due classi: `Studente` e `Corso`.
// La classe `Studente` contiene informazioni come nome e matricola.
// La classe `Corso` deve avere un metodo `iscrivi(Studente studente)` che stampa un messaggio
// come:
// `Studente Mario iscritto al corso di Matematica`.
// Questo  esercizio  serve  per  esercitarsi  con  metodi  che  ricevono  oggetti  di  classi  custom  come
// argomenti



package esercizio_2;

public class Studente {

    private String nome;

    private String matricola;


    public Studente(String nome, String matricola) {
        this.matricola = matricola;
        this.nome = nome;
    }


    // GETTERS
    public String getNome() {
        return nome;
    }


    public String getMatricola() {
        return matricola;
    }

    



}
