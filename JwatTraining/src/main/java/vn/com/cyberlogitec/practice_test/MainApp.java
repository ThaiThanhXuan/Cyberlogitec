package vn.com.cyberlogitec.practice_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room1 r1 = ctx.getBean(Room1.class);
		System.out.println(r1.getRoom()+":"+r1.getAnimal().getName());
		Room2 r2 = ctx.getBean(Room2.class);
		System.out.println(r2.getRoom()+":"+r2.getAnimal().getName());
		
		Room3 r3 = ctx.getBean(Room3.class);
		System.out.println(r3.getRoom()+":"+r3.getAnimal().getName());
		
	}

}
