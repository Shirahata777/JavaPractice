package pkg.javasilver.chapter10;

import java.io.FileInputStream;

public class Practice10 {
	
	public static void main(String[] args) {
		try (FileInputStream is = new FileInputStream("sample.txt")) {
			
		} catch (Exception e) {
			System.out.println("A");
		} finally {
//			tryブロックで宣言したものはfinallyで使えない
//			if (is != null) {
//				is.close();
//			}
			System.out.println("B");
		}
	}

}
