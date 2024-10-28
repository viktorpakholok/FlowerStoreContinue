package ua.edu.ucu.apps.flowerstore.payment;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.Item;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;

public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double res = 0;
        for (Item item : items) {
            res += item.price();
        }
        return res;
    }

    public void ProcesOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
        System.out.println("Your order is processed");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
