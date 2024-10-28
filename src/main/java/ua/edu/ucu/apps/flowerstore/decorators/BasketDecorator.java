package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;
    private final static double BASKET_PRICE = 4;

    public double price() {
        return BASKET_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in basket decorator";
    }
}
