package vn.com.cyberlogitec.Ioc;

public class Room1 implements Room {
	private Animal animal;
	public Room1(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return animal;
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 1";
	}

}
