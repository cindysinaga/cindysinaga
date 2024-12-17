package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class ShippingInfo {
    private int shippingId;
    private String shippingType;
    private String shippingDate;
    private String shippingAddress;

    public ShippingInfo(int shippingId, String shippingType, String shippingDate, String shippingAddress) {
        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingDate = shippingDate;
        this.shippingAddress = shippingAddress;
    }

    
    public int getShippingId() { return shippingId; }
    public void setShippingId(int shippingId) { this.shippingId = shippingId; }

    public String getShippingType() { return shippingType; }
    public void setShippingType(String shippingType) { this.shippingType = shippingType; }

    public String getShippingDate() { return shippingDate; }
    public void setShippingDate(String shippingDate) { this.shippingDate = shippingDate; }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }

    
    public void updateShippingInfo() {
        
    }
}
