package ToDoApp;

public class DatiNonValidiException extends RuntimeException {
    public DatiNonValidiException(String messaggio) {
        super(messaggio);
    }
}
