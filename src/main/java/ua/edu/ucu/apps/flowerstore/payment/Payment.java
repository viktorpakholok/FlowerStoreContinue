package ua.edu.ucu.apps.flowerstore.payment;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.Item;

public interface Payment {
    final String description = "Paid by "; 
    public void pay(double price);

    // public Payment() {
    //     this.desctiption = "Paid by credit card";
    // }
}
