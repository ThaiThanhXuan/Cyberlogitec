package vn.com.cyberlogitec.day01;

public class Room1 implements Room{
	private int id = 1;
	private Animal animal;
	
	public Room1(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public int getRoom() {
		return this.id;
	}
	@Override
	public String getAnimal() {
		return animal.getName();
	}
}
