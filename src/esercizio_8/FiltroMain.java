package esercizio_8;

import java.util.Arrays;
import java.util.List;

public class FiltroMain {
    public static void main(String[] args) {
        

        List<String> parole = Arrays.asList("Apple", "banana", "albero", "Cane", "Aquila", "Armadietto", "casco", "aragon del Signore degli Anelli");

        List<String> lunghe = Filtro.filtraParole(parole, new FiltraParoleLunghe());
        System.out.println("Parole lunghe > di 5: " + lunghe);

        List<String> iniziaConA = Filtro.filtraParole(parole, new FiltraIniziaConA());
        System.out.println("Parole che iniziano con A: " + iniziaConA);
    }
}
