package it.redoddity.music;

public class Drums extends Instrument {
	public void play() {
		if(Math.random() > 0.5)
			System.out.println("BAM!");
		else
			System.out.println("BUM!");
	}
}
