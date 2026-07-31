package ToDoApp;

public class TaskSemplice extends Task {
    public TaskSemplice (String codice, String titolo, Priorita priorita, int durata) {
        super(codice, titolo, priorita, durata);
    }

    @Override
    public void completa(){
        setCompletato(true);
    }
}
