package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    private static final double RIBBON_PRICE = 40;
    private Item item;

    public double price() {
        return RIBBON_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in ribbon decorator";
    }
}
