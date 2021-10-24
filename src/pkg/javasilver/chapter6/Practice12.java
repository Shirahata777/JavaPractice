package pkg.javasilver.chapter6;

public class Practice12 {
	
	public static void main (String[] args) {
		
//		staticなのでコンストラクタから値代入されない
		System.out.println(Item2.num);
		
//		初期化子→コンストラクタの順で代入される
		Item2 i2 = new Item2();
		System.out.println(i2.num);
	}

}
