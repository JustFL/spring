package factory;

import entity.Car;
import entity.Wheel;

public class StaticFactory {
	public static Car getCar() {
		Car car = new Car(10000, new Wheel("mimi"));
		return car;
	}
}
