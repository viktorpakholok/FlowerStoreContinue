package ua.edu.ucu.apps.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment {
    private String description = Payment.description + "PayPal";
    
    @Override
    public void pay(double price) {
        System.out.println("You paid" + price + description);
    }
}
