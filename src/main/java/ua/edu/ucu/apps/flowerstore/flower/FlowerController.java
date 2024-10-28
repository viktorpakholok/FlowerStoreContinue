package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    private static final double PRICE = 100;
    private static final int SPEAL_LENGTH = 10;

    @GetMapping("flower") // ("/hello")
    public List<Flower> helloWorld() {
        return List.of(
            new Flower(
                PRICE, FlowerColor.BLUE, SPEAL_LENGTH, FlowerType.CHAMOMILE)
        );
    }
}
