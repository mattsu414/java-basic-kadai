package kadai_021;

import java.util.Arrays;
import java.util.List;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書オブジェクトを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 調べたい単語リスト
		List<String> words = Arrays.asList("apple", "banana", "grape", "orange");

		for (String word : words) {
			if (dictionary.contains(word)) {
				System.out.println(word + "の意味は" + dictionary.getMeaning(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}

