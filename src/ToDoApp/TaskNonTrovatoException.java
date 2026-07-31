package ToDoApp;

public class TaskNonTrovatoException extends RuntimeException {
    public TaskNonTrovatoException (String messaggio) {
        super(messaggio);
    }
}
