package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in);

    // 自分のじゃんけんの手入力
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice = scanner.nextLine();

        // 正しいじゃんけんの手であるか判定
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("正しく入力してください");
            choice = scanner.nextLine();
        }

        return choice;
    }

    // 対戦相手のじゃんけんランダムで選ぶ
    public String getRandom() {
        String[] fightMate = { "r", "s", "p" };
        int i = (int) Math.floor(Math.random() * 3);
        return fightMate[i];
    }

    // 勝敗を判定する
    public String getResult(String myChoice, String opponentChoice) {
        if (myChoice.equals(opponentChoice)) {
            return "あいこです";
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            return "自分の勝ちです";
        } else {
            return "自分の負けです";
        }
    }
    
    //r,s,pをグーチョキパーで表示するメソッド
    public String toJapanese(String choice) {
    	switch (choice) {
    	case "r":
    		return"グー";
    	case "s":
    		return"チョキ";
    	case "p":
    		return"パー";
    	default:
    		return"不明";
    	}
    }


}
