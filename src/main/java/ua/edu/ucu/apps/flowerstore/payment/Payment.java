package ua.edu.ucu.apps.flowerstore.payment;

public interface Payment {
    String DESCRIPTION = "by "; 
    void pay(double price);

    // public Payment() {
    //     this.desctiption = "Paid by credit card";
    // }
}
