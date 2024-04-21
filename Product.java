package ecommercesystem;

public class Product {
      protected int productId;
    protected String name;
    protected double price;
    public Product(){}
    public Product(int productId, String name, double price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }
    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }
    public int getProductId() {
        return productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = Math.abs(price);
    }
    public double getPrice() {
        return price;
    } 
}
