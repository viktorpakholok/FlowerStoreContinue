package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
	private static final double Price = 100;
	private static final int SepalLength = 10;

    @GetMapping("flower") // ("/hello")
	public List<Flower> helloWorld() {
		return List.of(
			new Flower(Price, FlowerColor.BLUE, SepalLength, FlowerType.CHAMOMILE)
		);
	}
}
