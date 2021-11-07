package pkg.javasilver.chapter7;

public class Practice14 {
	
	public static void main(String[] args) {
		Sample14_1 a = new Sample14_3();
		Sample14_2 b = new Sample14_3();
		Sample14_3 c = new Sample14_3();
		
//		Sample14_1ではcreate()は実装されていないためエラー（ポリフォーリズム）
//		a.create();
		
		b.Work();
		c.report();
	}

}
