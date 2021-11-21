package pkg.javasilver.chapter9;

public class Practice4 {

	public static void main(String[] args) {
		char a = '0';
		int num = 0;
		
//		アルファべとか調べる
		if (Character.isAlphabetic(a)) {
			num++;
		}
//		数字か調べる
		if (Character.isDigit(a)) {
			num++;
		}
//		lowercaseか調べる
		if (Character.isLowerCase(a)) {
			num++;
		}

		System.out.println(num);
	}

}
