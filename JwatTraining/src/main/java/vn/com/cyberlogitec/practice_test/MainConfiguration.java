package vn.com.cyberlogitec.practice_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

	@Bean
	public Dog dog() {
		return new Dog();
	}
	@Bean
	public Cat cat() {
		return new Cat();
	}
	@Bean
	public Bird bird() {
		return new Bird();
	}
	@Bean
	public Room1 room1() {
		return new Room1(dog());
	}
	@Bean
	public Room2 room2() {
		Room2 room2 = new Room2();
		room2.setAnimal(cat());
		return room2;
	}
	@Bean
	public Room3 room3() {
		
		return new Room3();
	}

}
