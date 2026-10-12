
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    // Ajouter une tâche
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Afficher toutes les tâches
    public void showTasks() {
        for (Task task : tasks) {
            System.out.println("Title: " + task.getTitle());
            System.out.println("Status: " + task.getStatus());
            System.out.println("------------------");
        }
    }
    
    // Modifier le statut d'une tâche
    public void updateTask(int index, TaskStatus status) {
        if (index < 0 || index >= tasks.size()) {
            throw new IllegalArgumentException("Invalid task index");
        }

        tasks.get(index).setStatus(status);
    }

    // Supprimer une tâche
    public void deleteTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IllegalArgumentException("Invalid task index");
        }

        tasks.remove(index);
    }
}
