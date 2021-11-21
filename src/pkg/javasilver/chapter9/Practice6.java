package pkg.javasilver.chapter9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Practice6 {
	
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2021, 11, 20);
		LocalDate b = LocalDate.now();
//		その週の指定した曜日を返す
		System.out.println(b.with(DayOfWeek.MONDAY));
		
//		isBeforeは前の日付かを判定する
		System.out.println(a.equals(b) + "," + a.isBefore(b));
	}

}
