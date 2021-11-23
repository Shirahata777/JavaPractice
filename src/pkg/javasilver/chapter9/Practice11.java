package pkg.javasilver.chapter9;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice11 {

	public static void main(String[] args) {
		ArrayList<Sample11> list = new ArrayList<>(Arrays.asList(new Sample11("a", 21), new Sample11("b", 12),
				new Sample11("c", 13), new Sample11("a", 21)));
		
		
//		removeはequalsメソッドで一致した初めのデータを削除する
		list.remove(new Sample11("a", 21));
		
		for (Sample11 s : list) {
			System.out.println(s.getName());
		}
		
	}

}
