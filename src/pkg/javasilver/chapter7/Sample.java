package pkg.javasilver.chapter7;

// public を外してもpublicに変換される
interface Sample {
	// インターフェース内のメソッドはstaticかdefaault修飾子をつけないと記述できない
//	public void test() {
//		
//	}
	default void test1() {
		System.out.println("Hello");
	}

	public static void test2() {

	}
//	Java.lang.Objectに記載されているメソッドをオーバーライドするとコンパイルエラー
//	@Override
//	default String toString() {
//
//	}
}
