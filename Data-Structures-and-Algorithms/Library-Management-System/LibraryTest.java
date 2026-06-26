package ques6LibraryManagementSystem;
public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C Programming", "Dennis Ritchie"),
                new Book(104, "Data Structures", "Mark Allen")
        };

        System.out.println("Linear Search:");

        Book book1 = LibraryManager.linearSearch(books, "Python");

        if (book1 != null)
            System.out.println(book1);

        LibraryManager.sortBooks(books);

        System.out.println("\nBinary Search:");

        Book book2 = LibraryManager.binarySearch(books, "Python");

        if (book2 != null)
            System.out.println(book2);
    }
}