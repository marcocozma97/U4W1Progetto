package ToDoApp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task1 = new TaskSemplice("T01", "Studiare Java", Priorita.ALTA, 120);
        Task task2 = new TaskConScadenza("T02", "Ripassare Front-end", Priorita.MEDIA, 60, LocalDate.now());
        Task task3 = new TaskRicorrente("T03", "Leggere", Priorita.BASSA, 10, 30);

        System.out.println(task1.isCompletato()); // False, perchè non è completato
        task1.completa(); // Il metodo cambia il booleano in True, ora è completato
        System.out.println(task1.isCompletato()); // True, ora è realmente  completato

    }
}