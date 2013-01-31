package org.nusco;

public class Pet {

	private final String name;
	protected boolean isDead = false;
	protected boolean isEaten = false;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void bury() {
		isDead = true;
	}

	public void eat(Pet pet) {
		pet.isEaten = true;
	}

}
