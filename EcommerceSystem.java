package ecommercesystem;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the E-commerce system!");
        System.out.println("please enter your id:");
        int customerId = input.nextInt();
        input.nextLine();
        System.out.println("please enter your name:");
        String name = input.nextLine();
        System.out.println("please enter your address:");
        String address = input.nextLine();

        Customer customer1 = new Customer(customerId, name, address);

        ElectronicProduct electronicProduct1 = new ElectronicProduct(1, "smartphone", 599.9f, "Apple", 1);
        ClothingProduct clothingProduct1 = new ClothingProduct(2, "T-shirt", 19.99f, "large", "Cotton");
        BookProduct bookProduct1 = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");

        System.out.println("How many products do you want to add to your cart?");
        int numProducts = input.nextInt();
        Cart cart1 = new Cart(customer1.getCustomerId(), numProducts);

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Which product would you like to add? (1 - Smartphone, 2 - T-shirt, 3 - OOP)");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    cart1.addProduct(electronicProduct1, i);
                    break;
                case 2:
                    cart1.addProduct(clothingProduct1, i);
                    break;
                case 3:
                    cart1.addProduct(bookProduct1, i);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        float totalPrice = cart1.calculatePrice();
        System.out.println("Your total is $" + totalPrice + ". Would you like to place the order? 1 - yes, 2 - no");
        int placeOrderChoice = input.nextInt();
        if (placeOrderChoice == 1) {
            Order order1 = new Order(customer1.getCustomerId(), 1, cart1.getProducts());
            System.out.println("Here is your order summary:");
            order1.printOrderInfo();
        } else {
            System.out.println("Order not placed.");
        }
}
    }
    
