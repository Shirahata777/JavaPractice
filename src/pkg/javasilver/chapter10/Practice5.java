package pkg.javasilver.chapter10;

public class Practice5 {
	
	public static void main(String[] args) {
		System.out.println(test(null));
	}

	private static String test(Object o) {
		try {
			System.out.println(o.toString());
		} catch(NullPointerException e) {
			return "a";
		} finally {
			System.out.println("B");
		}
		return "C";
	}

}
