package it.redoddity.wordcounter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordCounterTest {

	@Test
	public void testReturnsAnEmptyMapForAnEmptyText() {
		WordCounter counter = new WordCounter("");
		assertEquals("[]", counter.getCounts().toString());
	}

	@Test
	public void testCountsASingleWord() {
		WordCounter counter = new WordCounter("ciao");
		assertEquals("[ciao => 1]", counter.getCounts().toString());
	}

	@Test
	public void testCountsTwoWords() {
		WordCounter counter = new WordCounter("ciao bongo");
		assertEquals("[ciao => 1, bongo => 1]", counter.getCounts().toString());
	}

	@Test
	public void testCountsDoubleWords() {
		WordCounter counter = new WordCounter("ciao ciao");
		assertEquals("[ciao => 2]", counter.getCounts().toString());
	}

	@Test
	public void testCountsWordsInText() {
		WordCounter counter = new WordCounter("ciao ciao bongo");
		assertEquals("[ciao => 2, bongo => 1]", counter.getCounts().toString());
	}

	@Test
	public void testSortsResultsFromHigherToLowestOccurrences() {
		WordCounter counter = new WordCounter("ciao bongo ciao ciao bongo addio");
		assertEquals("[ciao => 3, bongo => 2, addio => 1]", counter.getCounts().toString());
	}

	@Test
	public void testStripsPunctuation() {
		WordCounter counter = new WordCounter("42?: \"ciao, ciao.... bongo!\"");
		assertEquals("[ciao => 2, bongo => 1]", counter.getCounts().toString());
	}

	@Test
	public void testIgnoresCase() {
		WordCounter counter = new WordCounter("bOnGo BONGO");
		assertEquals("[bongo => 2]", counter.getCounts().toString());
	}
}
