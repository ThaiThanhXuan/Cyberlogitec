package vn.com.cyberlogitec.config;

public class MainConfiguration {
	public Animal Dog() {
		return new Dog();
	}
	
	public Animal Cat() {
		return new Cat();	
	}
	
	public Animal Bird() {
		return new Bird();
	}
	
	public Room Room1() {
		return new Room1(Dog());
	}
	
	public Room Room2() {
		Room2 room = new Room2();
		room.setAnimal(Cat());
		return room;
	}
	public Room Room3() {
		return new Room3();
	}
}
