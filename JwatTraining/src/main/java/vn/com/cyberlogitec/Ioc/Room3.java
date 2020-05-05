package vn.com.cyberlogitec.Ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Room3 implements Room {
	@Autowired
	@Qualifier("initDog")
	private Animal animal;
	
	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return animal;
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 3";
	}

}
