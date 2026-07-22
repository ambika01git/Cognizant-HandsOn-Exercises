package ques4EmployeeManagementSystem;
public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(101, "Amit", "Manager", 50000));
        manager.addEmployee(new Employee(102, "Priya", "Developer", 45000));
        manager.addEmployee(new Employee(103, "Rahul", "Tester", 40000));

        System.out.println("\nEmployee List:");
        manager.displayEmployees();

        System.out.println("\nSearching Employee:");
        Employee emp = manager.searchEmployee(102);

        if (emp != null) {
            System.out.println(emp);
        }

        manager.deleteEmployee(101);

        System.out.println("\nAfter Deletion:");
        manager.displayEmployees();
    }
}