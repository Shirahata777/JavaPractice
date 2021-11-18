package pkg.practice.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

		list.sort((a, b) -> -a.compareTo(b));

		for (Integer i : list) {
			System.out.println(i);
		}

	}

}
