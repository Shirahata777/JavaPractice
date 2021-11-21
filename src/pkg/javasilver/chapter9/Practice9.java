package pkg.javasilver.chapter9;

import java.util.ArrayList;

public class Practice9 {
	
	public static void main(String[] args) {
//		ジェネリクスをつけないとどの型のオブジェクトも入る
		ArrayList list = new ArrayList<>();
		
		list.add("こんちは！");
		
//		以下のようにまだない配列番号は指定できない（実行時エラー）
//		list.add(2, 10);
//		ある場合は指定できる
		list.add(1, 10);
		list.add('番');
		list.add("さん");
		
		for (Object o : list) {
			System.out.print(o);
		}
	}

}
