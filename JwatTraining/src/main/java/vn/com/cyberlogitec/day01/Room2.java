package vn.com.cyberlogitec.day01;

public class Room2 implements Room{
	private int id = 2;
	private Animal animal;
	
	public int getRoom() {
		return this.id;
	}
	
	public String getAnimal() {
		return animal.getName();
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
