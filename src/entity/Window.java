package entity;

import org.springframework.stereotype.Repository;

@Repository
public class Window {
	private String brand = "panpan";

	@Override
	public String toString() {
		return "Window [brand=" + brand + "]";
	}

}
