package vn.com.cyberlogitec.Ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainApp {
	public static void main(String [] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room1 room1 = ctx.getBean(Room1.class);
		System.out.println(room1.getRoom()+" "+room1.getAnimal().getname());
		Room2 room2 = ctx.getBean(Room2.class);
		System.out.println(room2.getRoom()+" "+room2.getAnimal().getname());
		Room3 room3 = ctx.getBean(Room3.class);
		System.out.println(room3.getRoom()+" "+room3.getAnimal().getname());
	}
}
