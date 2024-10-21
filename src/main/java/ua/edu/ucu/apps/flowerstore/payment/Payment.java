package ua.edu.ucu.apps.flowerstore.payment;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.Item;

public interface Payment {
    // final String desctiption; 
    public double pay(List<Item> items);

    // public Payment() {
    //     this.desctiption = "Paid by credit card";
    // }
}
