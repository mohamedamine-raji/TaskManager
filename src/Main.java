
public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        // CREATE
        manager.addTask(new Task("Learn Java", "Practice OOP"));
        manager.addTask(new Task("Learn Git", "Practice Git"));

        // READ
        System.out.println("Before update:");
        manager.showTasks();

        // UPDATE
        manager.updateTask(0, TaskStatus.DONE);

        System.out.println("After update:");
        manager.showTasks();

        // DELETE
        manager.deleteTask(1);

        System.out.println("After delete:");
        manager.showTasks();

        // EXCEPTION HANDLING
        try {
            manager.deleteTask(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    } // Fin de main()

} // Fin de class Main
