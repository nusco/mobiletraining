package org.nusco;

import java.util.HashMap;
import java.util.Map;

public class PetCemetery {

	public final Map<String, Pet> namesToAnimals = new HashMap<String, Pet>();
	
	public int getSize() {
		return namesToAnimals.size();
	}

	public void bury(Pet pet) {
		pet.bury();
		namesToAnimals.put(pet.getName(), pet);
	}

	public Pet resuscitate(String name) {
		return namesToAnimals.get(name);
	}

}
