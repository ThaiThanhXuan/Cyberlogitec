package vn.com.cyberlogitec.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vn.com.cyberlogitec.ioc.animal.Bird;
import vn.com.cyberlogitec.ioc.animal.Cat;
import vn.com.cyberlogitec.ioc.animal.Dog;
import vn.com.cyberlogitec.ioc.room.Room1;
import vn.com.cyberlogitec.ioc.room.Room2;
import vn.com.cyberlogitec.ioc.room.Room3;

@Configuration
public class MainConfiguration {
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Room1 room1() {
		return new Room1(cat());
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean 
	public Room2 room2() {
		Room2 r2 = new Room2();
		r2.setRoom2(dog());
		return r2;
	}
	
	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Room3 room3() {
		return new Room3(bird());
	}
}

