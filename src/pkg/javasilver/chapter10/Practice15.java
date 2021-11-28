package pkg.javasilver.chapter10;

public class Practice15 {

	public static void main(String[] args) {
		SampleA a = new SampleA(1);
		SampleB b = new SampleB(1);
		
//		ClassCastException
		System.out.println(a.equals(b));

	}

}
