package pkg.practice.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {
	
	public static void main(String[] args) {
		Sample2[] samples = {
				new Sample2(1, "a"),
				new Sample2(3, "b"),
				new Sample2(2, "c"),
		};
		
		List<Sample2>  list = new ArrayList<Sample2>(Arrays.asList(samples));
		
		list.sort(new SampleComparator());
		
		for (Sample2 s : list) {
			System.out.println(s.getName());
		}
	}

}
