package ques5TaskManagementSystem;
public class TaskTest {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(101, "Design UI", "Pending");
        manager.addTask(102, "Write Code", "In Progress");
        manager.addTask(103, "Testing", "Pending");

        System.out.println("\nTask List:");
        manager.displayTasks();

        System.out.println("\nSearching Task:");
        manager.searchTask(102);

        manager.deleteTask(101);

        System.out.println("\nAfter Deletion:");
        manager.displayTasks();
    }
}