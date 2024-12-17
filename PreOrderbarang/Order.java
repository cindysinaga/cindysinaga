package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Order {
    private int orderId;
    private String customerId;
    private String dateCreated;
    private String status;

    public Order(int orderId, String customerId, String dateCreated, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getDateCreated() { return dateCreated; }
    public void setDateCreated(String dateCreated) { this.dateCreated = dateCreated; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

   
    public void placeOrder() {
        
    }

    
    public void cancelOrder() {
        
    }

    
    public void viewOrderDetails() {
        
    }
}
