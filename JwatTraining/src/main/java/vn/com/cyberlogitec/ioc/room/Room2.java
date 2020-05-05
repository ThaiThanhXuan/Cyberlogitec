package vn.com.cyberlogitec.ioc.room;

import vn.com.cyberlogitec.ioc.animal.Animal;

public class Room2 implements Room{
	
	private Animal animal;
	
	public Room2() {}
	
	public Room2(Animal animal) {
		this.animal = animal;
	}
	
	public void setRoom2(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "room2";
	}
}
