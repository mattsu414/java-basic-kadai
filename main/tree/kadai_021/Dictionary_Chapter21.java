package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;

	// コンストラクタ：辞書を初期化
	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	// 単語が存在するか
	public boolean contains(String word) {
		return dictionary.containsKey(word);
	}

	// 意味を取得する
	public String getMeaning(String word) {
		return dictionary.get(word);
	}
}

