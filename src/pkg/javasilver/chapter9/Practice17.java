package pkg.javasilver.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice17 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList(new String[] { "a", "b", "c","d" }));

		list.removeIf((String s) -> {
			return "b".equals(s);
		});
		
//		削除した後に読み込んでもエラーは発生しない
		for (String s : list) {
			System.out.println(s);
		}
	}
}
