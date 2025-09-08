// Esercizio 10 - Gioco di ruolo con interfacce e metodi su oggetti
// Crea un’interfaccia `Attaccabile` con metodo `void subisciDanno(int danno)`.
// Crea una classe `Personaggio` che implementa `Attaccabile` e ha punti vita e nome.
// Crea  una  classe  `Giocatore`  con  metodo  `attacca(Attaccabile  nemico,  int  danno)`  che  chiama
// `subisciDanno()`.
// Obiettivo: rinforzare polimorfismo e interazione tra classi tramite interfacce



package esercizio_10;

public class Personaggio implements Attaccabile{

    private int puntiVita;

    private String nome;

    public Personaggio(int puntiVita, String nome) {
        this.nome = nome;
        this.puntiVita = puntiVita;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void subisciDanno(int danno) {
        puntiVita -= danno;
        if (puntiVita < 0) {
            puntiVita = 0;
        }
        System.out.println("Il personaggio: " + nome + " ha subito un danno pari a: " + danno + ". Punti vita rimanenti: " + puntiVita);
    }



}
