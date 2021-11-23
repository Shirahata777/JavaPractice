package pkg.javasilver.chapter9;

import java.util.Arrays;
import java.util.List;

public class Practice13 {
	
	public static void main(String[] arags) {
//		固定帳の配列（追加・削除できない）
		var list1 = Arrays.asList(new Integer[] {1,2,3});
		var list2 = List.of(1,2,3);
		
//		実行時エラー
//		list1.add(1);
//		list2.remove(1);
		
//		setは可能
		list1.set(1, 4);
		 for (Object o : list1) {
			 System.out.println(o);
		 }
	}

}
