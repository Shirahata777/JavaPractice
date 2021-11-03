package pkg.javasilver.chapter7;

// 抽象クラス
// インスタンス化不可、抽象化メソッドはサブクラスが実装し直さなければならない(オーバーライド)
// 
public abstract class Practice2 {
//	具象メソッド（サブクラスが引き継ぐ）
	public void A() {
		
	}
//	抽象メソッド
//	サブクラスで実装（サブクラスが抽象クラスであれば実装しなくても良い）
	public abstract void B();
}
