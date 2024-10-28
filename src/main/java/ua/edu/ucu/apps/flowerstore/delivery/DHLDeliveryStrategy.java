package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.Item;

public class DHLDeliveryStrategy implements Delivery {
    private String deliveryNotification = Delivery.deliveryNotification + "DHL";

    public void deliver(List<Item> items) {
        System.out.println("Your items: " + items.toString() + " are " + deliveryNotification);
    }
}
