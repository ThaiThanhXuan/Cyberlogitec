package vn.com.cyberlogitec.practice_test;

public class Room1 implements Room{
	private Animal animal;
	public Room1(Animal animal) {
		this.animal = animal;	
	}
	@Override
	public String getRoom() {
		return "Room1";
	}
	@Override
	public Animal getAnimal() {
		return animal;
	}
}
