package vn.com.cyberlogitec.ioc.room;

import vn.com.cyberlogitec.ioc.animal.Animal;

public class Room3 implements Room{
	
	private Animal animal;
	
	public Room3() {};
	
	public Room3(Animal animal) {
		this.animal = animal;
	}
	
	public void setRoom3(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "room3";
	}
}
