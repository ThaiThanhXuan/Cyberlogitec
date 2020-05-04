package vn.com.cyberlogitec.day01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
	@Bean
	public Animal Cat() {
		return new Cat();
	}
	
	@Bean
	public Animal Dog() {
		return new Dog();
	}
	
	@Bean
	public Animal Bird() {
		return new Bird();
	}
	
	@Bean
	public Room Room1() {
		return new Room1(Cat());
	}
	
	@Bean
	public Room Room2() {
		Room2 room = new Room2();
		room.setAnimal(Dog());
		return room;
	}
	
	@Bean Room Room3() {
		return new Room3();
	}
}
