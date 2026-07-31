package ToDoApp;

import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    // 'List<Task>' per indicare che questa variabile conterrà una lista di oggetti Task.
    // 'listaTask' è il contenitore (il "cesto") dove salveremo tutti i nostri task creati.
    private List<Task> listaTask;

     // Viene eseguito nel momento esatto in cui scriviamo "new TaskManager()" e inizializza la lista.
    public TaskManager() {
        this.listaTask = new ArrayList<>();
    }

     // AGGIUNGI TASKS - Aggiungere un nuovo task alla lista, ma PRIMA controllare che non esista già il codice

    public void aggiungiTask(Task task) {

        // Per ogni Task 't' presente dentro 'listaTask', fa un controllo
        for (Task t : listaTask) {

            // Prendiamo il codice del task che stiamo esaminando nel ciclo (t.getCodice())
            // e lo confrontiamo con il codice del task che vogliamo aggiungere (task.getCodice()).
            // Usiamo '.equals()' come se fosse il == di Javascript.
            if (t.getCodice().equals(task.getCodice())) {
                // SE TROVIAMO UN DUPLICATO: Lancia un'eccezione personalizzata ("TaskEsistenteException").
                // Questo blocca immediatamente tutto e impedisce che si crei un doppione.
                throw new TaskEsistenteException("Errore: Esiste già un task con il codice " + task.getCodice());
            }
        }

        // Se il ciclo non si ferma, allora la task viene aggiunta alla lista con .add()
        listaTask.add(task);
        System.out.println("Task aggiunto con successo: " + task.getCodice());
    }

    // METODO CERCA PER CODICE Trova e restituisce un Task partendo dal suo codice.

    public Task cercaPerCodice(String codice) {

        // Funzionamento Stream
        // 'listaTask.stream()' prende tutti gli elementi della lista e li inizia a far scorrere.
        // '.filter(...)' va a setacciare gli elementi.
        // 't -> t.getCodice().equals(codice)' è una LAMBDA FUNCTION:
        //    - 't' rappresenta il singolo task.
        //    - 't.getCodice().equals(codice)': indica che è valido solo il task con il codice uguale a quello che stiamo cercando.
        // '.findFirst()' prende il primo elemento trovato dal filter
        // '.orElse(null)' se non si trova nulla, ci ridà 'null'".
        Task taskTrovato = listaTask.stream()
                .filter(t -> t.getCodice().equals(codice))
                .findFirst()
                .orElse(null);

        // Se alla fine ci ridà come risultato 'null' allora facciamo partire la nostra eccezione personalizzata.
        if (taskTrovato == null) {
            throw new TaskNonTrovatoException("Errore: Nessun task trovato con codice " + codice);
        }

        // Se invece è tornato tutto, restituisce il task trovato.
        return taskTrovato;
    }
}