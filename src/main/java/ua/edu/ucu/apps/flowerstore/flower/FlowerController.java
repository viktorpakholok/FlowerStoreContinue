package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    private static final double PRICE_ONE = 100;
    private static final double PRICE_TWO = 25;
    private static final double PRICE_THREE = 50;

    private static final int SEPAL_LENGTH_ONE = 10;
    private static final int SEPAL_LENGTH_TWO = 2;
    private static final int SEPAL_LENGTH_THREE = 6;

    @GetMapping // ("/hello")
    public List<Flower> flowers() {
        return List.of(
            new Flower(
                PRICE_ONE, 
                new FlowerSpec(FlowerColor.BLUE, 
                    SEPAL_LENGTH_ONE, 
                    FlowerType.CHAMOMILE
                )
            ),

            new Flower(
                PRICE_TWO, 
                new FlowerSpec(FlowerColor.RED, 
                    SEPAL_LENGTH_TWO, 
                    FlowerType.CACTUS
                )
            ),

            new Flower(
                PRICE_THREE, 
                new FlowerSpec(FlowerColor.WHITE, 
                    SEPAL_LENGTH_THREE, 
                    FlowerType.ROMASHKA
                )
            )
        );
    }
}
