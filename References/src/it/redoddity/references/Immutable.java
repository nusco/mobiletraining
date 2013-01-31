package it.redoddity.references;

public class Immutable {
	public static void main(String[] args) {
		String s = "ciao";
		s = s.replace('c', 'z');
		System.out.println(s);
	}
}
