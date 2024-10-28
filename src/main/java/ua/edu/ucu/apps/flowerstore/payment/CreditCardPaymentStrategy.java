package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {
    private String description = Payment.description + "credit card";
    
    @Override
    public void pay(double price) {
        System.out.println(description);
    }
}
