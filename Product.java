package artspace;

// This class represent a product (an artwork)
public class Product {

// Attributes of the product
    private int ID;
    private String name;
    private double price;

    // Constructor to initialize customer details
    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods for each attribute
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method to display product details
    @Override
    public String toString() {
        return "Product ID: " + ID + ", Name: " + name + ", Price: " + String.format("%.2f", price) + " SAR";
    }

}
