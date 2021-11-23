package pkg.javasilver.chapter9;

import java.util.ArrayList;

public class Practice13 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		for (String s : list) {
			if ("3".equals(s)) {
				list.remove(s);
			}
		}
		
//		上記でremoveを用いて削除している時、再度listを読み込もうとするとエラーが発生する
//		なお、最後から二番目（今回の場合は4）をremoveするとエラーは発生しない？
		for (String s : list) {
			System.out.println(s);
		}
	}

}
