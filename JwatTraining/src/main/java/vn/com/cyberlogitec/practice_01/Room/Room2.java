package vn.com.cyberlogitec.practice_01.Room;

import vn.com.cyberlogitec.practice_01.Animal.*;

public class Room2 implements IRoom {
	
	private IAnimal animal;
	
	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public String getAnimal() {
		return animal.getName();
	}

	@Override
	public String getRoom() {
		return "Room2";
	}

}
