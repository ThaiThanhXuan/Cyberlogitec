package vn.com.cyberlogitec.practice_test;

public class Room2 implements Room{
	private Animal animal;
	@Override
	public String getRoom() {
		return "Room2";
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Override
	public Animal getAnimal() {
		return animal;
	}
}
