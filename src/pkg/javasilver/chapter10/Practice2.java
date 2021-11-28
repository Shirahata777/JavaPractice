package pkg.javasilver.chapter10;

public class Practice2 {
	
	public static void main(String[] args) {
		try {
//			起動時にパラメーラーを渡さないとき、args.lengthは０になる
			if (args.length == 0) {
				System.out.println("1");
			}
		} catch(NullPointerException e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
	}

}
