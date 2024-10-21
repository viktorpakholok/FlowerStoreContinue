package ua.edu.ucu.apps.flowerstore.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Flower extends Item {
    private double sepalLength;
    private FlowerType flowertype;
    private double price;
}
