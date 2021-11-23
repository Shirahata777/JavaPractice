package pkg.javasilver.chapter9;

import java.util.Arrays;

public class Practice16 {
	
	public static void main(String[] args) {
		String[] a = {"b", "c"};
		String[] b = {"a", "b", "c"};
		
//		compareメソッドは配列を比較し、どちらの初めの一文字目が辞書順で最初に登場するかを調べる
		
//		第二引数が初めの場合「１」を返す
		System.out.println(Arrays.compare(a, b));
//		第一引数が初めの場合「-１」を返す
		System.out.println(Arrays.compare(b, a));
//		同じ場合は「0」を返す
		System.out.println(Arrays.compare(b, b));
	}

}
