package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class Administrator extends User {
    private String adminId;
    private String adminName;

    public Administrator(String userId, String password, String address, String phoneNumber, String email, String adminId, String adminName) {
        super(userId, password, address, phoneNumber, email);
        this.adminId = adminId;
        this.adminName = adminName;
    }

    
    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }

    public String getAdminName() { return adminName; }
    public void setAdminName(String adminName) { this.adminName = adminName; }

    
    public void addProducts() {
        
    }

    
    public void updateProduct() {
        
    }

    
    public void deleteProduct() {
        
    }

    
    public void generateReport() {
        
    }
}
