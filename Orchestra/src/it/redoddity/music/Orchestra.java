package it.redoddity.music;

public class Orchestra {
	public static void main(String[] args) {
		Sax s = new Sax();
		playIntro(s);
		Drums d = new Drums();
		playIntro(d);
		Violin v = new Violin();
		playIntro(v);
	}

	private static void playIntro(Instrument i) {
		i.play();
		i.play();
		i.play();
	}
}
