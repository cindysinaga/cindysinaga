package PreOrderbarang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import PreOrderbarang.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */

/**
 * Class yang merepresentasikan keranjang belanja dalam sistem e-commerce.
 */
public class ShoppingCart {
    private int cartId;
    private String customerId;
    private List<Product> products;

    public ShoppingCart(int cartId, String customerId) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.products = new ArrayList<>();
    }

    
    public int getCartId() { return cartId; }
    public void setCartId(int cartId) { this.cartId = cartId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public List<Product> getProducts() { return products; }

    
    public void addProduct(Product product) {
        this.products.add(product);
    }

    
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    
    public void updateProductQuantity(Product product, int quantity) {
        for (Product p : products) {
            if (p.getProductId() == product.getProductId()) {
                p.setStock(quantity);
            }
        }
    }

    
    public void viewCartDetails() {
        for (Product p : products) {
            System.out.println("Product ID: " + p.getProductId() + ", Name: " + p.getProductName() + ", Quantity: " + p.getStock());
        }
    }

    
    public void checkout() {
        
        System.out.println("Checkout complete. Total items: " + products.size());
    }
}
