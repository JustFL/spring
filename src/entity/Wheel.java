package entity;

public class Wheel {
	public String brand;
	

	public Wheel() {
		
	}
	
	public Wheel(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Wheel brand: " + brand;
	}
	
	
}
