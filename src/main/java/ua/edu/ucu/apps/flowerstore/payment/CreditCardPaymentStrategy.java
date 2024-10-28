package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {
    private String description = Payment.Description + "credit card";
    
    @Override
    public void pay(double price) {
        System.out.println("You paid" + price + description);
    }
}
