package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    @GetMapping("flower") // ("/hello")
	public List<Flower> helloWorld() {
		return List.of(new Flower(100, FlowerType.CHAMOLILE, 100));
	}
}
