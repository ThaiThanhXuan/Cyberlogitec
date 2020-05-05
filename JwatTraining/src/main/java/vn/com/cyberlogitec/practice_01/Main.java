package vn.com.cyberlogitec.practice_01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vn.com.cyberlogitec.practice_01.Room.Room1;
import vn.com.cyberlogitec.practice_01.Room.Room2;
import vn.com.cyberlogitec.practice_01.Room.Room3;


public class Main {

	public static void main(String[] args) {
		ApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
		Room1 room1 = config.getBean(Room1.class);
		System.out.println(room1.getRoom()+ " : " +room1.getAnimal());
		Room2 room2 = config.getBean(Room2.class);
		System.out.println(room2.getRoom()+ " : " +room2.getAnimal());
		Room3 room3 = config.getBean(Room3.class);
		System.out.println(room3.getRoom()+ " : " +room3.getAnimal());
	}

}
