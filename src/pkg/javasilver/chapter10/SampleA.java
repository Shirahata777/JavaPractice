package pkg.javasilver.chapter10;

public class SampleA {
	private int num;
	public SampleA(int num) {
		this.num = num;
	}
	public boolean equals(Object o) {
		SampleA a = (SampleA) o;
		return this.num == a.num;
	}

}
