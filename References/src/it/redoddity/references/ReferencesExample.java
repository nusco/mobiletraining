package it.redoddity.references;

public class ReferencesExample {
	public static void main(String[] args) {
		int intValue = 12;
		modify(intValue);
//		System.out.println(intValue);
		
		Integer integerValue = new Integer(12);
		modify(integerValue);
//		System.out.println(integerValue);
		
		String stringValue = "12";
		modify(stringValue);
//		System.out.println(stringValue);
		
		Box boxValue = new Box(12);
		modify(boxValue);
//		System.out.println(boxValue);
	}

	private static void modify(int i) {
		i = 42;
	}

	private static void modify(Integer i) {
		i = new Integer(42);
	}

	private static void modify(String s) {
		s = "42";
	}

	private static void modify(Box b) {
		b.i = 42;
	}
}
