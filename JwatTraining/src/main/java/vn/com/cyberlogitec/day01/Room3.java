package vn.com.cyberlogitec.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Room3 implements Room{
	private int id = 3;
	
	@Autowired
	@Qualifier("Bird")
	private Animal animal;
	
	public int getRoom() {
		return this.id;
	}
	
	public String getAnimal() {
		return animal.getName();
	}
}
