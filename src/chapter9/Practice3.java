package chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

//		デフォルトは自然順
		list.sort((a, b) -> a.compareTo(b));
		
//		-つけると逆になる
//		list.sort((a, b) -> -a.compareTo(b));
		
//		変数を左右入れ替えても逆順になる
//		list.sort((a, b) -> b.compareTo(a));

		for (Integer i : list) {
			System.out.println(i);
		}

	}

}
