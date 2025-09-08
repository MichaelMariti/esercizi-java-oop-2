package esercizio_6;

public class MainAnimale {



    public static void main(String[] args) {
        

        // Cane c1 = new Cane();
        // Gatto g1 = new Gatto();

        Animale[] array = new Animale[2];

        array[0] = new Cane();
        array[1] = new Gatto();

        for (Animale a : array) {
            a.verso();
        }






    }
}
