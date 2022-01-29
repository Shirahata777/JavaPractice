package pkg.javasilver.pre20220116;

public class Main {
	
	static int num = 10;
	
	public static void main(String[] args) {
//		配列の要素数が指定されている時、{}による変数代入は使えない
//		String[] list = new String[3]{};
//		System.out.println(list);
		
		Main.num += 10;
		Main m = new Main();
//		コンパイル時に「Main.num = 30」に置き換わる
		m.num = 30;
		
//		staticなメソッドからstaticなメソッドを呼び出せる
//		staticなメソッドからstaticではないメソッドは呼び出せない
	}

}
