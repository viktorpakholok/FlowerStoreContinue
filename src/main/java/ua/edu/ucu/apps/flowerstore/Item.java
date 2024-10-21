package ua.edu.ucu.apps.flowerstore;

public abstract class Item {
    public String description;
    abstract double price();
    
    public String getDescription() {
        return description;
    }
}
