// Esercizio 6 - Interfaccia e polimorfismo con array
// Definisci un'interfaccia `Animale` con un metodo `verso()`.
// Crea  due  classi  `Cane`  e  `Gatto`  che  implementano  `Animale`  e  forniscono
// un’implementazione concreta di `verso()`.
// Nel  metodo  `main`,  crea  un  array  di  `Animale`  con  istanze  di  `Cane`  e  `Gatto`  e  invoca
// `verso()` per ciascuno.
// Questo esercizio mostra l’utilità del polimorfismo



package esercizio_6;

public interface Animale {
    void verso();
}
