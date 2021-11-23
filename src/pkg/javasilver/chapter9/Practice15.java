package pkg.javasilver.chapter9;

import java.util.Arrays;

public class Practice15 {
	
	public static void main(String[] args) {
		String[] a = {"b", "c"};
		String[] b = {"a", "b", "c"};
		
//		mismatchメソッドは配列を比較し、初めに一致しなかったインデックスを返す
		System.out.println(Arrays.mismatch(a, b));
	}

}
