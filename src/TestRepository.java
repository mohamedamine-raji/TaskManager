
public class TestRepository {

    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();

        System.out.println("Before DELETE:");
        repository.showAllTasks();

        // DELETE Task ID = 3
        repository.deleteTask(3);

        System.out.println("After DELETE:");
        repository.showAllTasks();
    }
}
