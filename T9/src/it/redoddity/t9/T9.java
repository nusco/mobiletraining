package it.redoddity.t9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class T9 {
	private Map<String, String> words2codes = new TreeMap<String, String>();

	public T9(String[] words) {
		for (String word : words) {
			words2codes.put(word, word2num(word));
		}
	}

	public String getMatch(String keys) {
		Set<String> words = words2codes.keySet();
		for (String word : words)
			if (isExactMatch(word, keys))
				return word;
		for (String word : words)
			if (isAMatch(word, keys))
				return word;
		return "";
	}

	private boolean isAMatch(String word, String keys) {
		return words2codes.get(word).startsWith(keys);
	}
	
	private boolean isExactMatch(String word, String keys) {
		return words2codes.get(word).equals(keys);
	}

	private String word2num(String word) {
		word = word.replaceAll("[a-c]", "2");
		word = word.replaceAll("[d-f]", "3");
		word = word.replaceAll("[g-i]", "4");
		word = word.replaceAll("[j-l]", "5");
		word = word.replaceAll("[m-o]", "6");
		word = word.replaceAll("[p-s]", "7");
		word = word.replaceAll("[t-v]", "8");
		word = word.replaceAll("[w-z]", "9");
		return word;
	}
}
