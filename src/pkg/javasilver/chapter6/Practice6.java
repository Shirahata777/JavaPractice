package pkg.javasilver.chapter6;

public class Practice6 {
	
	public static void act () {
		Item m = new Item();
		
//		引数が足りないためコンパイルエラー
//		int result = m.methods(2);
		
		int result = m.methods(2, 2);
		
		System.out.println(result);
	}

}
