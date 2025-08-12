import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(45, "Shoes", "Fashion"),
            new Product(77, "Mobile", "Electronics"),
            new Product(13, "Book", "Education"),
            new Product(60, "Watch", "Accessories")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, "Book");
        System.out.println(result1 != null ? result1 : "Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\n=== Binary Search ===");
        Product result2 = binarySearch(products, "Book");
        System.out.println(result2 != null ? result2 : "Not Found");
    }

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].productName);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
