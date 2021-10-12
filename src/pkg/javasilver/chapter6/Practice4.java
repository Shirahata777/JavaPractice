package pkg.javasilver.chapter6;

public class Practice4 {

	public static void act() {
		Item pre1 = new Item();
//		ガーベッジコレクションの対象
		Item pre2 = new Item();

		pre1.setNum(2021);
		System.out.println(pre1);
	}

}
