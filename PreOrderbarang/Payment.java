package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Payment {
    private String paymentId;
    private int orderId;
    private float amount;
    private String paymentMethod;
    private String status;

    public Payment(String paymentId, int orderId, float amount, String paymentMethod, String status) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    
    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    
    public void processPayment() {
        
    }

    
    public void updatePaymentStatus() {
        
    }

    
    public void getPaymentDetails() {
        
    }
}
