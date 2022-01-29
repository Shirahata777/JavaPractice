package pkg.javasilver.pre20220129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TfIdf {
	
	public static double action() {
		String word = "こんにちは";
		double tf = 0.0;
		double tfidf = 0.0;
		
		List<List<String>> mophologyList = new ArrayList<>();
		mophologyList.add(Arrays.asList("こんにちは","みなさん","今日", "も", "いい", "天気", "ですね"));
		mophologyList.add(Arrays.asList("こんにちは","みなさん","今日", "も", "いい", "天気", "ですね"));
		mophologyList.add(Arrays.asList("こんにちは","みなさん","今日", "も", "いい", "天気", "ですね"));
		
		double includeWordDocuments = 10;
		
		double idf = Math.log(mophologyList.size() / (includeWordDocuments + 1));
		
		for (List<String> s : mophologyList) {
			tf = includeWord(word, s) / s.size();
			tfidf += tf * idf;
		}
		
		
		return tfidf;
	}
	
	private static double includeWord(String word, List<String> mophologyCount) {
		double includeWord = 0;
		
		for (String s : mophologyCount) {
			if (word.equals(s)) {
				includeWord++;
			}
		}
		return includeWord;
	}

}
