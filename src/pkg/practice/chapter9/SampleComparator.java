package pkg.practice.chapter9;

import java.util.Comparator;

public class SampleComparator implements Comparator<Sample2> {
	@Override
	public int compare(Sample2 s1, Sample2 s2) {
		
		if (s1.getId() < s2.getId()) {
			return 1;
		}
		if (s1.getId() > s2.getId()) {
			return -1;
		}
		
		return 0;
	}

}
