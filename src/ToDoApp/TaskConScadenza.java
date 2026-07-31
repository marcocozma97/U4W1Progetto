package ToDoApp;

import java.time.LocalDate;

public class TaskConScadenza extends Task {
    private LocalDate scadenza;

    public TaskConScadenza(String codice, String titolo, Priorita priorita, int durata, LocalDate scadenza) {
        super(codice, titolo, priorita, durata);
        this.scadenza = scadenza;
    }

    // Inserisco anche getScadenza per avere la variabile scadenza anche qui

    public LocalDate getScadenza() {
        return scadenza;
    }

    @Override
    public void completa() {
        setCompletato(true);
    }
}
