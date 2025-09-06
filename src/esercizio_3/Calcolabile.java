// Esercizio 3 - Interfaccia `Calcolabile`
// Definisci un'interfaccia `Calcolabile` con un metodo `int calcola();`.
// Crea due classi che la implementano:
// - `Quadrato` (con campo `lato`) che calcola e ritorna l’area.
// - `Rettangolo` (con `base` e `altezza`) che ritorna l’area.
// Scrivi  un  metodo  che  accetta  un  oggetto  `Calcolabile`  e  stampa  il  risultato  del  metodo
// `calcola()`.
// L'obiettivo è applicare interfacce e polimorfismo.



package esercizio_3;

public interface Calcolabile {


    public abstract int calcola();

    public abstract void stampaRisultato();
}
