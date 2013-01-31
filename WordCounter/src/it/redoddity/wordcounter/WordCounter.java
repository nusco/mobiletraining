package it.redoddity.wordcounter;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WordCounter {

	private String text;

	public WordCounter(String text) {
		this.text = text;
	}

	public List<Count> getCounts() {
		List<Count> result = new LinkedList<Count>();
		for (String word : getWordsInText()) {
			Count count = findCurrentCount(result, word);
			if (count == null)
				result.add(new Count(word, 1));
			else
				count.inc();
		}
		Collections.sort(result, new Comparator<Count>() {
			@Override
			public int compare(Count o1, Count o2) {
				return o2.getOccurrences() - o1.getOccurrences();
			}
		});
		return result;
	}

	private Count findCurrentCount(List<Count> result, String word) {
		for (Count count : result)
			if (count.getWord().equals(word))
				return count;
		return null;
	}

	private List<String> getWordsInText() {
		String[] splits = text.toLowerCase().split("[^a-z]+");
		List<String> words = new LinkedList<String>();
		for (int i = 0; i < splits.length; i++)
			if (!splits[i].isEmpty())
				words.add(splits[i]);
		return words;
	}
}
