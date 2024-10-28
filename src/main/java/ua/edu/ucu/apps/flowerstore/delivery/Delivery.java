package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.Item;

public interface Delivery {
    public String deliveryNotification = "delivered by ";

    public void deliver(List<Item> items);
}
