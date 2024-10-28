package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;
    private static final double ribbonPrice = 40;

    public double price() {
        return ribbonPrice + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in ribbon decorator";
    }
}
