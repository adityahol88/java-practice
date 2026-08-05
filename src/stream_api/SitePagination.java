/**
 * Problem: Given a list of product names, display only the products on a
 * requested page, where every page contains a fixed number of products.
 */

package stream_api;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/** Demonstrates pagination with the stream {@code skip} and {@code limit} operations. */
public class SitePagination {
    
    /** Returns the products belonging to the requested one-based page. */
    List<String> productsOnPage(List<String> products, int pageNumber, int pageSize) {
        return products.stream()
                .skip((pageNumber - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }
    /** Reads a page number and displays the products on that page. */
    public static void main(String[] args) {
        List<String> products = new ArrayList<>(Arrays.asList(
                "Product 1", "Product 2", "Product 3", "Product 4", "Product 5",
                "Product 6", "Product 7", "Product 8", "Product 9", "Product 10",
                "Product 11", "Product 12", "Product 13", "Product 14", "Product 15",
                "Product 16", "Product 17", "Product 18", "Product 19", "Product 20"
        ));
        SitePagination pagination = new SitePagination();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter page number:");
        int pageNumber = scanner.nextInt();
        
        List<String> page3Products = pagination.productsOnPage(products, pageNumber, 5);
        System.out.println("Products on page " + pageNumber + ":");
        System.out.println(page3Products);
        scanner.close();
    }
    
}
