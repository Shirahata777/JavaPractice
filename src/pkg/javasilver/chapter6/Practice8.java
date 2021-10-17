package pkg.javasilver.chapter6;

public class Practice8 {
	
	public static void act () {
		Practice8.method(4);
	}
	
	public static void method (int num) {
		if (0 > num) return; 
		
		System.out.println(num);
//		値を返さなければvoidの中でもretrunはかける（なんのため？）
		return;
//		returnの後にコードは書けない（コンパイルエラー）
//		System.out.println(num);
	}

}
