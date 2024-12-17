package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Customer extends User {
    private String customerId;
    private String customerName;

    public Customer(String userId, String password, String address, String phoneNumber, String email, String customerId, String customerName) {
        super(userId, password, address, phoneNumber, email);
        this.customerId = customerId;
        this.customerName = customerName;
    }

    
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    
    public void placeOrder() {
        
    }

    
    public void viewOrderDetails() {
        
    }
}
