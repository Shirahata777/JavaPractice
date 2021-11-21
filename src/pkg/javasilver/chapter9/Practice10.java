package pkg.javasilver.chapter9;

import java.util.ArrayList;

public class Practice10 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		list.add("こんちは！");
//		配列番号を指定して、値を更新できる
		list.set(0, "こんにちは！");
		list.add('番');
		list.set(1, "10番さん");
		
		for (Object o : list) {
			System.out.print(o);
		}
	}

}
