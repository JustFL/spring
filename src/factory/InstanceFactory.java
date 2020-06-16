package factory;

import entity.Car;
import entity.Wheel;

public class InstanceFactory {
	public Car getCar() {
		Car car = new Car(50000, new Wheel("pipi"));
		return car;
	}
}
