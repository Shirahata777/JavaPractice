package pkg.javasilver.chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice4 {

	public static void main(String[] args) {
		List<Sample> list = Arrays.asList(new Sample(10), new Sample(20), new Sample(30));

//		Predicateは引数を受け取り、booleanを返す
//		デフォルトで「論理積(and)」「論理和(or)」「否定(nagete)」,staticメソッド「isEqual」をもつ
		Predicate<Sample> x = y -> list.contains(y);
		
		if (x.test(new Sample(20))) {
			System.out.println(list.contains(new Sample(40)));
		}
		
//		Supplierは引数を受け取らず、結果のみを返す
		Supplier<List<Integer>> s = () -> Arrays.asList(10,20,30);
		
		for (Integer i : s.get()) {
			System.out.println(i);
		}
		
//		Consumerは引数は受けとるが、結果は返さない
		Consumer c = (str) -> System.out.println(str);
		c.accept("こんにちはみなさん！");
		
		Function <String, Integer> f = (num) -> {
			return Integer.parseInt(num);
		};
		System.out.println(f.apply("123"));
		
	}
}

class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
	};

	public boolean equals(Object o) {

		if (o instanceof Sample == false) {
			return false;
		}
		;

		if (this.num == ((Sample) o).num) {
			return true;
		}

		return false;
	}
}
