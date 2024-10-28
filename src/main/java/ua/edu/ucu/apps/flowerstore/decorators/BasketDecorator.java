package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    public double price() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in basket decorator";
    }
}
