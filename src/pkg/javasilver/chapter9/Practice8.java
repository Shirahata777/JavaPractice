package pkg.javasilver.chapter9;

import java.util.ArrayList;

public class Practice8 {
	
	public static void main(String[] args) {
//		ジェネリクスをつけないとどの型のオブジェクトも入る
		ArrayList list = new ArrayList<>();
		
		list.add("こんちは！");
		list.add(10);
		list.add('番');
		list.add("さん");
		
		for (Object o : list) {
			System.out.print(o);
//			ダウンキャスト時にClassCastExceptionエラーが発生する可能性あり
//			System.out.print((String) o);
		}
	}

}
