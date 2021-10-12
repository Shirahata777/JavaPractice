package pkg.practice.chapter2;

import java.time.Instant;

public class Practice2_2 {

	public static void practice() {
		
		// 現在時刻
		Instant i1 = Instant.now();
		System.out.println(i1);
		
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		System.out.println(i2);
		long l = i2.toEpochMilli();
		System.out.println(l);
	}
}
