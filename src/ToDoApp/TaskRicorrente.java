package ToDoApp;

public class TaskRicorrente extends Task {
    private int frequenzaGiorni;
    private int contatoreCompletamenti;

    public TaskRicorrente(String codice, String titolo, Priorita priorita, int durata, int frequenzaGiorni) {
        super(codice, titolo, priorita, durata);
        this.frequenzaGiorni = frequenzaGiorni;
        this.contatoreCompletamenti = 0;
    }

    @Override
    public void completa() {
        this.contatoreCompletamenti++;
        setCompletato(false);
    }

    // --- GETTER E SETTER DA AVERE RICHIAMATI PER DOPO ---
    public int getFrequenzaGiorni() {
        return frequenzaGiorni;
    }

    public void setFrequenzaGiorni(int frequenzaGiorni) {
        this.frequenzaGiorni = frequenzaGiorni;
    }

    public int getContatoreCompletamenti() {
        return contatoreCompletamenti;
    }

    public void setContatoreCompletamenti(int contatoreCompletamenti) {
        this.contatoreCompletamenti = contatoreCompletamenti;
    }
}
