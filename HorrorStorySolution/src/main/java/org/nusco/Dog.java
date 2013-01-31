package org.nusco;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String toString() {
		if(isEaten)
			return "I can only see " + getName() + "'s head here";
		if(isDead)
			return getName() + " is a horrible zombie dog";
		return getName() + " is a nice dog";
	}
}
