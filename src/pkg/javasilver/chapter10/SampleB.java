package pkg.javasilver.chapter10;

public class SampleB {
	private int num;
	public SampleB(int num) {
		this.num = num;
	}
	public boolean equals(Object o) {
		SampleB b = (SampleB) o;
		return this.num == b.num;
	}

}
