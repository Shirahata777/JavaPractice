package pkg.javasilver.chapter10;

public class Practice16 {

	public static void main(String[] args) {
		String str = null;

//		nullにメソッドを使うとエラーが発生する
		if (str.equals("")) {
			System.out.println("Blank");
		} else {
			System.out.println("Null");
		}

//		以下はエラーが発生しない
//		if ("".equals(str)) {
//			System.out.println("Blank");
//		} else {
//			System.out.println("Null");
//		}
	}

}
