package esercizio_7;

public class ContatoreMain {
    public static void main(String[] args) {
        

        Controllore c1 = new Controllore();
        Contatore count1 = new Contatore();

        System.out.println("Valore prima dell'incremento: " + count1.getCount());

        c1.eseguiIncremento(count1);

        System.out.println("Valore dopo: " + count1.getCount());



    }
}
