package pkg.practice;

public class Practice2 {
	
	public static void Practice2() {
		
		String s ="Java and JavaScript";
		
		if (s.contains("Java")) {
			System.out.println("Java という文字が含まれています！");
		}
		if (s.endsWith("Java")) {
			System.out.println("Java という文字が末尾にあります！");
		}
		if (s.startsWith("Java")) {
			System.out.println("Java という文字が先頭にあります！");
		}
		
		System.out.println("Java という文字は先頭から" + String.format("%d", s.indexOf("Java")) + "の位置にあります");
		System.out.println("Java という文字は最後に登場する位置は" + String.format("%d", s.lastIndexOf("Java")) + "です");
		
	}

}
