package pkg.javasilver.chapter6;

public class Item {

	private int num = 1990;
	static int num2 = 0; 

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void print() {
		System.out.println("数字は" + num + "です。");
	}
	
	public int methods(int a, int b) {
		return a / b;
	}
}
