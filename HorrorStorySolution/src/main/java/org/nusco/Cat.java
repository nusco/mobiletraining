package org.nusco;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		if(isEaten)
			return "I can only see " + getName() + "'s tail here";
		if(isDead)
			return getName() + " is a smelly dead cat";
		return getName() + " is a smart cat";
	}
}
