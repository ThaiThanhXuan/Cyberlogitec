package vn.com.cyberlogitec.Room;

import vn.com.cyberlogitec.Animal.IAnimal;

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
