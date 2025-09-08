// Crea due classi: `Contatore` con un metodo `incrementa()` che aumenta un contatore interno,
// e  `Controllore`  con  metodo  `eseguiIncremento(Contatore  c)`  che  chiama  `c.incrementa()`  tre
// volte.
// Obiettivo: far vedere come una classe può operare su un'altra classe custom e modificare il suo
// stato.



package esercizio_7;

public class Controllore {



    public void eseguiIncremento(Contatore c) {
        c.incrementa();
        c.incrementa();
        c.incrementa();
    }


}
