package pkg.javasilver.chapter10;

public class Practice1 {

	public static void main(String[] args) {
		try {
			int[] array = {};
//			ここでエラー発生
			array[0] = 10;
			System.out.println("fisish");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		
	}

}
