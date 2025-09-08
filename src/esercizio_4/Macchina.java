// Crea due classi: `Motore` e `Macchina`.
// La classe `Motore` deve avere un metodo `accendi()` che stampa "Motore acceso".
// La  classe  `Macchina`  deve  avere  un  metodo  `parti()`  che  crea  un  oggetto  `Motore`  e  chiama
// `accendi()`.
// Scopo:  comprendere  come  una  classe  può  collaborare  con  un’altra  per  svolgere  una  funzione
// più complessa.



package esercizio_4;

public class Macchina {


    public void parti() {
        Motore m1 = new Motore();

        m1.accendi();
    }
}
