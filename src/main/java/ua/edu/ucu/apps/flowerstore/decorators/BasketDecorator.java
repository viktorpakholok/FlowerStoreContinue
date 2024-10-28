package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;
    private static final double BasketPrice = 4;

    public double price() {
        return BasketPrice + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in basket decorator";
    }
}
