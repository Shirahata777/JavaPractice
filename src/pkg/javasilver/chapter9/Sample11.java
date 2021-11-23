package pkg.javasilver.chapter9;

public class Sample11 {
	
	private String name;
	private int price;
	
	public Sample11(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Sample11) {
			Sample11 p11 = (Sample11) o;
			
			if (p11.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

}
