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

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Priorita getPriorita() {
        return priorita;
    }

    public void setPriorita(Priorita priorita) {
        this.priorita = priorita;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public boolean isCompletato() {
        return completato;
    }

    public void setCompletato(boolean completato) {
        this.completato = completato;
    }
}

