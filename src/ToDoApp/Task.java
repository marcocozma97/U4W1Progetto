package ToDoApp;

public abstract class Task {
    private String codice;
    private String titolo;
    private Priorita priorita;
    private int durata;
    private boolean completato;

    public Task(String codice, String titolo, Priorita priorita, int durata) {
        this.codice = codice;
        this.titolo = titolo;
        this.priorita = priorita;
        this.durata = durata;
        this.completato = false;
    }

    public abstract void completa();

}