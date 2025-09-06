// Esercizio 1 - Costruzione di un oggetto con metodi fluenti
// Crea una classe `Pizza` che permetta di aggiungere ingredienti con metodi come:
// `Pizza aggiungiMozzarella();`, `Pizza aggiungiPomodoro();`, `Pizza aggiungiProsciutto();`
// Ogni metodo deve restituire lo stesso oggetto `Pizza` per permettere catene di chiamate come:
// `Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();`
// L'obiettivo è far comprendere il concetto di metodi che ritornano `this`, spesso utilizzati in Java
// per implementare il pattern 'fluent interface'.



package esercizio_1;

public class Pizza {

    private StringBuilder ingredienti;



    public Pizza() {
        ingredienti = new StringBuilder();
    }
    

    public Pizza aggiungiMozzarella() {
        if(ingredienti.length() > 0) {
            ingredienti.append(", ");
        }
        ingredienti.append("Mozzarella");
        return this;
    }

    public Pizza aggiungiPomodoro() {
        if (ingredienti.length() > 0) {
            ingredienti.append(", ");
        }
        ingredienti.append("Pomodoro");
        return this;
    }

    public Pizza aggiungiProsciutto() {
        if (ingredienti.length() > 0) {
            ingredienti.append(", ");
        }
        ingredienti.append("Prosciutto");
        return this;
    }

    public StringBuilder getIngredienti() {
        return ingredienti;
    }

    


}
