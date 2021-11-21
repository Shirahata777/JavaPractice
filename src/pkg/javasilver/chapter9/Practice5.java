package pkg.javasilver.chapter9;

import java.time.LocalDate;

public class Practice5 {
	
	public static void main(String[] args) {
//		LocalDateAPI（0だとエラーが起きる）
		LocalDate a = LocalDate.of(2021, 1, 1);
//		文字列でも指定できる（0埋めしなければならない）
		LocalDate b = LocalDate.parse("2021-01-01");
		System.out.println(a.equals(b));
	}

}
