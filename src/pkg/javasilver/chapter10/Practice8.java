package pkg.javasilver.chapter10;

public class Practice8 {
	
	public static void main(String[] args) {
		try {
			System.out.println("a");
		} finally {
			System.out.println("a");
		} 
//		finallyは複数書けない
//		finally {
//			System.out.println("a");
//		}
	}

}
