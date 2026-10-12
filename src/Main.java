
public class Main {

    public static void main(String[] args) {

        Task task1 = new Task(
            "Learn Java",
            "Practice OOP concepts"
        );

        System.out.println("Title: " + task1.getTitle());
        System.out.println("Description: " + task1.getDescription());
        System.out.println("Status: " + task1.getStatus());
    }
}
