package vn.com.cyberlogitec.Ioc;

public class Room2 implements Room {
	private Animal animal;
	public Room2() {
		
	}
	
	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return animal;
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 2";
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
