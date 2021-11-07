package pkg.javasilver.chapter7;

public class Practice16 {
	
	public static void main(String[] args) {
		Sample16_1 s1 = new Sample16_2();
//		ダウンキャストなので、(Sample16_2)をつける
//		アップキャストの時はいらない
		Sample16_2 s2 = (Sample16_2) s1; 
		s2.hello();
	}

}
