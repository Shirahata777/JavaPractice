package pkg.javasilver.chapter8;

public class Practice1 {

	public static void main(String[] args) {
		Sample1_1 s1 = (name) -> {
			System.out.println(name);
		};
		
//		以下でも可
//		Sample1_1 s = (String name) -> {
//			System.out.println(name);
//		};

		Sample1_2 s2 = new Sample1_2();
		s2.setLogic(s1);
		s2.doProcess("Lambda");
	}

}
