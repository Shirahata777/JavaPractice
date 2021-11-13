package pkg.javasilver.chapter8;

public class Practice3 {
	
	public static void main (String[] args) {
		String val = "test";
		
//		ラムダ指揮においても同じメソッドないで、同じ変数は使えない
		Function f = (val) -> {
			System.out.println(val);
		};
		
	}
	
	interface Function {
		String test(String name);
	}

}
