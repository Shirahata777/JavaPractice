package pkg.javasilver.chapter10;

import java.util.ArrayList;
import java.util.List;

public class Practice14 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
//		IndexOutOfBoundsExceptionが発生
		list.get(0);
	}

}
