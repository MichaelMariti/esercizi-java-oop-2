// Esercizio 5 - Costruzione di oggetti con metodo che ritorna se stesso
// Crea una classe `Utente` con campi `nome` ed `email`, e metodi come:
// `Utente setNome(String nome)` e `Utente setEmail(String email)`.
// Ogni metodo deve restituire `this` per permettere la costruzione dell’oggetto in modo fluente.
// Alla fine, aggiungi un metodo `stampa()` per visualizzare i dati.
// Questo esercizio rinforza il concetto di ritorno dell'oggetto stesso



package esercizio_5;

public class Utente {

    private String nome;

    private String email;


    // public Utente(String nome, String email) {
    //     this.nome = nome;
    //     this.email = email;
    // }

    public Utente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Utente setEmail(String email) {
        this.email = email;
        return this;
    }


    public void stampa() {
        System.out.println("Nome utente: " + nome + ", Email: " + email);
    }
}
