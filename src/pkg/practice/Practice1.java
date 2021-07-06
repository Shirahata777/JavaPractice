package pkg.practice;

public class Practice1 {

	public static void Practice() {
		String s1 = "我は汝";
		String s2 = "Persona!";
		String s3 = "persona!";

		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + String.format("%d", s1.length()));
	}
}
