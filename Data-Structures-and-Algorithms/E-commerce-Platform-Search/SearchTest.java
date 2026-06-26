package ques2EcommercePlatformSearchFunction;
public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Mouse", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Keyboard", "Electronics"),
                new Product(102, "Shoes", "Fashion")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = SearchOperations.linearSearch(products, 104);

        if (result1 != null)
            System.out.println(result1);

        // Binary Search
        SearchOperations.sortProducts(products);

        System.out.println("\nBinary Search:");
        Product result2 = SearchOperations.binarySearch(products, 104);

        if (result2 != null)
            System.out.println(result2);
    }
}
