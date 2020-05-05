package vn.com.cyberlogitec.practice_01.Room;

import vn.com.cyberlogitec.practice_01.Animal.*;

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
