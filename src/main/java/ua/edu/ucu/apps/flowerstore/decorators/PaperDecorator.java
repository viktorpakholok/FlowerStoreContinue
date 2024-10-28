package ua.edu.ucu.apps.flowerstore.decorators;

import ua.edu.ucu.apps.flowerstore.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    private final static double PAPER_PRICE = 13;

    public double price() {
        return PAPER_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in paper decorator";
    }
}
