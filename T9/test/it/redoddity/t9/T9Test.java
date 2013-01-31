package it.redoddity.t9;

import static org.junit.Assert.*;

import org.junit.Test;

public class T9Test {
	@Test
	public void testDoesNotMatch() {
		String[] words = new String[] {"i"};
		T9 t9 = new T9(words);
		String word = t9.getMatch("5");
		assertEquals("", word);
	}
	
	@Test
	public void testMatchWord() {
		String[] words = new String[] {"heila", "ciao"};
		T9 t9 = new T9(words);
		String word = t9.getMatch("2426");
		assertEquals("ciao", word);
	}
	
	@Test
	public void testMatchBeginningOfWord() {
		String[] words = new String[] {"ciao"};
		T9 t9 = new T9(words);
		String word = t9.getMatch("242");
		assertEquals("ciao", word);
	}
	
	@Test
	public void testReturnsFirstWordThatMatches() {
		String[] words = new String[] {"armadillo", "ciao", "cianzo"};
		T9 t9 = new T9(words);
		String word = t9.getMatch("242");
		assertEquals("cianzo", word);
	}
	
	@Test
	public void testPrefersFullWord() {
		String[] words = new String[] {"casale", "casa"};
		T9 t9 = new T9(words);
		String word = t9.getMatch("2272");
		assertEquals("casa", word);
	}
}
