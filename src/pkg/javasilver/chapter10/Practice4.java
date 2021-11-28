package pkg.javasilver.chapter10;

public class Practice4 {

	public static void main(String[] args) {
		try {
			Object obj = null;
//			nullをtoStringしてるので、エラーが発生
			System.out.println(obj.toString());
			System.out.println("A");
//			finallyを途中に差し込めない
//			} finally {
//				System.out.println("B");
		} catch(NullPointerException e) {
			System.out.println("B");
		}

	}

}
