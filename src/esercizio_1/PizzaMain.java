package esercizio_1;

public class PizzaMain {
    public static void main(String[] args) {
        

        Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro().aggiungiProsciutto();

        System.out.println("Pizza con: " + p.getIngredienti());
    }
}
