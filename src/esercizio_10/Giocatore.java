// Esercizio 10 - Gioco di ruolo con interfacce e metodi su oggetti
// Crea un’interfaccia `Attaccabile` con metodo `void subisciDanno(int danno)`.
// Crea una classe `Personaggio` che implementa `Attaccabile` e ha punti vita e nome.
// Crea  una  classe  `Giocatore`  con  metodo  `attacca(Attaccabile  nemico,  int  danno)`  che  chiama
// `subisciDanno()`.
// Obiettivo: rinforzare polimorfismo e interazione tra classi tramite interfacce



package esercizio_10;

public class Giocatore {

    public void attacca(Attaccabile nemico, int danno) {
        System.out.println("Attacco con danno di: " + danno);
        nemico.subisciDanno(danno);
    }
}
