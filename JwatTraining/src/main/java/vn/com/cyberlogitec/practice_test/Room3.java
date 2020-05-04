package vn.com.cyberlogitec.practice_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Room3 implements Room{
	@Autowired
	@Qualifier("bird")
	private Animal animal;
	@Override
	public String getRoom() {
		return "Room3";
	}
	@Override
	public Animal getAnimal() {
		return animal;
	}
	public Room3() {
		
	}
}
