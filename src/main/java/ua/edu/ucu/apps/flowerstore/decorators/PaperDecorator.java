package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    public double getPrice() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in paper decorator";
    }
}
