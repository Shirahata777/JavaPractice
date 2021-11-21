package pkg.javasilver.chapter9;

import java.util.Comparator;

//Comparatorは retrun 1 を返すと入れ替え、retrun -1 だと入れ替えない
//ファイルを分けずに並び替えを行うクラスに実装するには、compareToメソッドを実装する
public class SampleComparator implements Comparator<Sample2> {
	@Override
	public int compare(Sample2 s1, Sample2 s2) {
		
		if (s1.getId() < s2.getId()) {
			return 1;
		}
		if (s1.getId() > s2.getId()) {
			return -1;
		}
		
		return 0;
	}

}
