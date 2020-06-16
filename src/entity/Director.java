package entity;

import org.springframework.stereotype.Component;

@Component("director")
public class Director {
	public void film() {
		System.out.println("Titanic");
	}
}
