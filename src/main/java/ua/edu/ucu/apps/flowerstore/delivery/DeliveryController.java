package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.Item;
import ua.edu.ucu.apps.flowerstore.decorators.PaperDecorator;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerBucket;
import ua.edu.ucu.apps.flowerstore.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flower.FlowerPack;
import ua.edu.ucu.apps.flowerstore.flower.FlowerSpec;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    private static final double PRICE_ONE = 100;
    private static final double PRICE_TWO = 25;

    private static final int SEPAL_LENGTH_ONE = 10;
    private static final int SEPAL_LENGTH_TWO = 2;
    private static final int QUANTITY = 3;

    private Delivery delivery;

    public DeliveryController() {
        delivery = new PostDeliveryStrategy();
    }
    
    @GetMapping
    public String deliverItems() {
        List<Item> items = new ArrayList<>();
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowers(
            new FlowerPack(
                new Flower(PRICE_ONE, 
                    new FlowerSpec(FlowerColor.GREEN, 
                        SEPAL_LENGTH_ONE, 
                        FlowerType.CACTUS
                    )
                ), 
            QUANTITY)
        );

        items.add(flowerBucket);
        items.add(
            new PaperDecorator(
                new Flower(PRICE_TWO, 
                    new FlowerSpec(FlowerColor.WHITE, 
                        SEPAL_LENGTH_TWO, 
                        FlowerType.ROMASHKA
                    )
                )
            )
        );

        return delivery.deliver(items);
    }
}
