// Crea una classe `Messaggio` con un campo `testo`, e una classe `Formatter` con metodo:
// `Messaggio formatta(Messaggio msg)`
// Il  metodo  modifica  il  testo  (ad  es.  rendendolo  tutto  maiuscolo)  e  restituisce  un  nuovo
// `Messaggio`.
// Questo esercizio combina passaggio di oggetti e ritorno di oggetti custom.



package esercizio_9;

public class Formatter {

    public Messaggio formatta(Messaggio msg) {
        
        String testoFormattato = msg.getTesto().toUpperCase();

        return new Messaggio(testoFormattato);
    }


}
