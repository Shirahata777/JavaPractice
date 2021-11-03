package pkg.javasilver.chapter7;

public class Sample3 implements Sample2 {
	
	@Override
	public void test1() {
//		Sample2を挟んでいるので、呼び出せない
//		Sample1.super.test1();
//		継承や階層を跨がなければ呼び出せる
		Sample2.super.test1();
		System.out.println("Java");
	}

}
