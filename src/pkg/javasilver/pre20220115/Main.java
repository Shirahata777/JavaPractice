package pkg.javasilver.pre20220115;

public class Main {
	
	public static void main(String[] args) {
//		-128 ~ 127なら明示的なキャストなしで変数に代入できる
		byte b1 = 0b100110;
		
//		範囲外なら明示的キャストが必要
		byte b2 = (byte) 0b10011000000;
		System.out.println(b1);
		System.out.println(b2);
		
//		shortの範囲は -32768 ~ 32767
		short s1 = (short)32768;
		short s2 = 32767;
		System.out.println(s1);
		System.out.println(s2);
		
		int i1  = 10;
		int i2 = 10;
		
//		ショートサーキット演算子
//		左オペランドがfalseの場合、右オペランドは評価しない
		if (10 < i1 && 10 < ++i2)  {
			System.out.println("ショートサーキット演算子（&&）");
		}
		
//		ショートサーキット演算子ではない場合
//		右オペランドも評価
		if (10 < i1 & 10 < ++i2)  {
			System.out.println(i2);
		} else {
			System.out.println(i2);
		}
		
		Main m1 = new Main();
		Main m2 = null;
		
//		equalsにnullを私と常にfalseになる
		System.out.println(m1.equals(m2));
		
	}
	
//	equals をオーバライドする際はシグニチャはObjectにしなければならない
	private int num;
	public boolean equals(Main obj) {
		
		if (obj == null) {
			return false;
		}
		
		return this.num == obj.num;
		
	}

}
