package artspace;

// This class represents a customer
public class Customer {

    // Attributes of the customer
    private String name;
    private int ID;
    private String address;
    private String mobile;
    private String email;

    // Constructor to initialize customer details
    public Customer(String name, int ID, String address, String mobile, String email) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    // Getter and Setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override toString method to display customer details
    @Override
    public String toString() {
        return "Customer Name: " + name + ", ID: " + ID + ", Address: "
                + address + ", Mobile Number: " + mobile + ", Email: " + email;
    }

}
