package pkg.javasilver.chapter6;

public class Item2 {
	
	static int num;
	{
		num = 10;
	}
	
//	public Item2() {
//		num = 100;
//	}
	
	public Item2(String str) {
		num = 100;
		System.out.println(str);
	}
	
	void Item2() {
		System.out.println("A");
	}

}
