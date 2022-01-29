package pkg.javasilver.pre20220129;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;
		float f = 5.1f;
		long l = 1l;
//		int ← floatの場合キャスト式を記載しないといけない（欠損が発生するため）
		i = (int)f;
		System.out.println(i);
//		long ← int の場合はしなくていい（欠損がないため）
		l = i;
		System.out.println(l);
//		int ← longの場合キャスト式を記載しないといけない（欠損が発生するため）
		i = (int)l;
		System.out.println(i);
	}

}
