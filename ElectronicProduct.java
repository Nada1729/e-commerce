package ecommercesystem;

public class ElectronicProduct extends Product{
       protected String brand;
    protected int warrantyPeriod;
    public ElectronicProduct(){}
    public ElectronicProduct(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
     public String getBrand() {
        return brand;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
