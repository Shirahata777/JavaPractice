package pkg.javasilver.chapter8;

public class Practice2 {
	
	public static void main(String[] args) {
		Function f = (name) -> {
			return "Hello, " + name;
		};
		
//		以下でも可
//		Function f = name -> {
//			return "Hello, " + name;
//		};
		
//		以下でも可
//		Function f = (name) -> "Hello, " + name;
		
//		以下は不可
//		Function f = name -> {
//			"Hello, " + name;
//		};
		
//		以下は不可
//		Function f = (name) -> return "Hello, " + name;
			
		System.out.println(f.test("Java"));
	}
	
	

	private static interface Function {
		String test(String name);
	}
	
	

}
