package vn.com.cyberlogitec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import vn.com.cyberlogitec.Animal.Bird;
import vn.com.cyberlogitec.Animal.Cat;
import vn.com.cyberlogitec.Animal.Dog;
import vn.com.cyberlogitec.Room.Room1;
import vn.com.cyberlogitec.Room.Room2;
import vn.com.cyberlogitec.Room.Room3;

@Configuration
public class AppConfig {

	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Room1 room1() {
		return new Room1(bird());
	}
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Room2 room2() {
		Room2 room2 = new Room2();
		room2.setAnimal(cat());
		return room2;
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public Room3 room3() {
		return new Room3();
	}
}
