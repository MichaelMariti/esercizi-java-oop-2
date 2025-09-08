package esercizio_9;

public class MessaggioMain {
    public static void main(String[] args) {
        

        Messaggio m1 = new Messaggio("Ciao Mirela, come stai?");
        Formatter f1 = new Formatter();

        Messaggio m1Formattato = f1.formatta(m1);

        System.out.println("Messaggio originale: " + m1.getTesto());
        System.out.println("Messaggio formattato: " + m1Formattato.getTesto());
    }
}
