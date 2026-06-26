package ques3SortingCustomerOrders;
public class SortTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Amit", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Priya", 5000),
                new Order(104, "Neha", 3000)
        };

        System.out.println("Before Sorting:");
        SortOperations.display(orders);

        SortOperations.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        SortOperations.display(orders);

        Order[] orders2 = {

                new Order(101, "Amit", 2500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Priya", 5000),
                new Order(104, "Neha", 3000)
        };

        SortOperations.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        SortOperations.display(orders2);
    }
}