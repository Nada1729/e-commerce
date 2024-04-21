package ecommercesystem;

public class Customer extends Product {
        protected int customerId;
    protected String name;
    protected String address;
    public Customer(){}
    public Customer(int customerId, String name, String address) {
        this.customerId=customerId;
        this.name=name;
        this.address=address;
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getCustomerId() {
        return customerId;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

}
