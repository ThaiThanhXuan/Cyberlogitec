package vn.com.cyberlogitec.exercies;

import org.springframework.context.annotation.Bean;

public class Room1 implements Room {

	private Cat cat;

	@Bean
	public Cat cat() {
		return new Cat();
	}

	public Room1 room1() {
		return new Room1(cat());
	};

	public Room1(Cat cat) {
		this.setCat(cat);
	}

	//Empty constructor
	public Room1() {
		
	}

	public String getAnimal() {
		return "a";
	}

	public String getRoom() {
		return "@";
	}

	//Getter and Setter
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	
}
