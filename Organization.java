package artspace;

// This class represents the organization (ArtSpace)
public class Organization {

    // Attributes of the organization 
    private String name;
    private String address;
    private int ID;
    private Product[] products; // Array of products
    private Customer[] customers; // Array of customers

    // Constructor to initialize organization details
    public Organization(String name, String address, int ID, Product[] products, Customer[] customers) {
        this.name = name;
        this.address = address;
        this.ID = ID;
        this.products = products;
        this.customers = customers;
    }

    // Getter and Setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
    
    // Override toString method to display organization details
    @Override
    public String toString() {
        return "Organization Name: " + name + "\nAddress: " + address + "\nID: " + ID;
    
    }

}
