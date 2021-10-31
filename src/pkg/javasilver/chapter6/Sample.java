package pkg.javasilver.chapter6;

public class Sample {
	
	public Sample() {
//		thisの前に処理はかけない
//		System.out.println("A");
		this(null, 0);
		System.out.println("A");
	}

	public Sample(Object object, int i) {
		System.out.println("OK!");
	}

}
