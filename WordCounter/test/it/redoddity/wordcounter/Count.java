package it.redoddity.wordcounter;

public class Count {

	private final String word;
	private int occurrences;

	public Count(String word, int occurrences) {
		this.word = word;
		this.occurrences = occurrences;
	}

	public String getWord() {
		return word;
	}

	public int getOccurrences() {
		return occurrences;
	}

	public void inc() {
		occurrences++;
	}

	@Override
	public String toString() {
		return getWord() + " => " + getOccurrences();
	}
}
