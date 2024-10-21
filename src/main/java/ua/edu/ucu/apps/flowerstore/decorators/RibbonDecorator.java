package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public double getPrice() {
        return 40 + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in ribbon decorator";
    }
}
