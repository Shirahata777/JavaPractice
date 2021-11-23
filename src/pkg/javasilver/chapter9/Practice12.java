package pkg.javasilver.chapter9;

import java.util.ArrayList;

public class Practice12 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		for (Object s : list) {
			if ("2".equals(s)) {
				list.remove(s);
			} else {
				System.out.println(s);
			}
		}
	}

}
