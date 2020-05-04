package vn.com.cyberlogitec.exercies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public Room1 room1() {
		return new Room1();
	}
	
	@Bean
	public Room2 room2() {
		return new Room2();
	}
	
	@Bean
	public Room3 room3() {
		return new Room3();
	}
}
