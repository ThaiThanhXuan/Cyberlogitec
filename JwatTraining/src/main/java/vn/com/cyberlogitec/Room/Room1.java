package vn.com.cyberlogitec.Room;

import vn.com.cyberlogitec.Animal.IAnimal;

public class Room1 implements IRoom {
	
	private IAnimal animal;
	
	public Room1(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public String getAnimal() {
		return animal.getName();
	}
	@Override
	public String getRoom() {
		return "Room1";
	}
	
	

	

}
