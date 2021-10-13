package pkg.javasilver.chapter6;

public class Practice5 {
	
	public static void act() {
		Item.num2 = 1000;
		
		Item i = new Item();
		Item i2 = new Item();
		
		i2.num2 = 30;
		i.num2 = 0;
		
		System.out.println(Item.num2);
		
	}

}
