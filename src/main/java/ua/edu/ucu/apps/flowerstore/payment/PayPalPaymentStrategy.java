package ua.edu.ucu.apps.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment {
    private String description = Payment.description + "Pay pal";
    
    @Override
    public void pay(double price) {
        System.out.println(description);
    }
}
