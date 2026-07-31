package ToDoApp;

public class TaskEsistenteException extends RuntimeException {
    public TaskEsistenteException(String messaggio) {
        super(messaggio);
    }
}