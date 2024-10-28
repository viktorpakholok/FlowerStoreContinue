package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.Item;

public class PostDeliveryStrategy implements Delivery {
    private String deliveryNotification 
    = Delivery.DELIVERY_NOTIFICATION + "post";

    public void deliver(List<Item> items) {
        System.out.println(
            "Your items: " + items.toString() + " are " + deliveryNotification
        );
    }
}
