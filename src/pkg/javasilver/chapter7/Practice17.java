package pkg.javasilver.chapter7;

public class Practice17 {

	public static void main(String[] args) {
		Sample17_1 s1 = new Sample17_1();
		Sample17_2 s2 =  (Sample17_2) s1;
//		差分がないためエラーが発生
		s2.hello2();
		
	}
}
