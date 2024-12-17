package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

public class User {
    private String userId;
    private String password;
    private String address;
    private String phoneNumber;
    private String email;

    public User(String userId, String password, String address, String phoneNumber, String email) {
        this.userId = userId;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    
    public void register() {

    }

    
    public void login() {
        
    }

 
    public void updateProfile() {
    }
}