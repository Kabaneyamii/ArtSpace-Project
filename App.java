package artspace;

// This is the main class used to test the other classes
public class App {

    public static void main(String[] args) {
        // Create two product objets (artworks)
        Product p1 = new Product(101, "Starry Night", 1200.00);
        Product p2 = new Product(102, "The Great Wave off Kanagawa", 950.00);
        Product[] products = {p1, p2}; // Store them in an array

        // Create two customer objects
        Customer c1 = new Customer("Noor Alenzi", 7001, "Dammam", "0581234567", "noor.alenzi@gmail.com");
        Customer c2 = new Customer("Ahmed Alharbi", 7002, "Jeddah", "0579876543", "h.alharbi@gmail.com");
        Customer[] customers = {c1, c2}; // Store them in array

        // Create the organization object and include products and customers 
        Organization org = new Organization("ArtSpace", "Makkah, Saudi Arabia", 5050, products, customers);

        // Print organization information 
        System.out.println(org);

        //Print all products
        System.out.println("\n--- Products ---");
        for (Product p : products) {
            System.out.println(p);
        }

        // Print all customers
        System.out.println("\n--- Customers ---");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
