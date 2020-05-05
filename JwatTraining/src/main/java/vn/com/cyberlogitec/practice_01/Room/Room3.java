package vn.com.cyberlogitec.practice_01.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

import vn.com.cyberlogitec.practice_01.Animal.*;

@ComponentScan(basePackages="vn.com.cyberlogitec")
public class Room3 implements IRoom {

	@Autowired
	@Qualifier("dog")
	private IAnimal animal;

	@Override
	public String getAnimal() {
		return animal.getName();
	}

	@Override
	public String getRoom() {
		return "Room3";
	}
	
}
