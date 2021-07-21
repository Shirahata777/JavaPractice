package pkg.practice.chapter2;

import java.util.Date;

public class Practice2_1 {
	
	public static void practice() {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.getTime());
		
		Date past = new Date(1216622225935L);
		
		System.out.println(past);
	}

}
