package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
	    
	        Jyanken_Chapter28 game = new Jyanken_Chapter28();
	        String myChoice = game.getMyChoice();
	        String opponentChoice = game.getRandom();
	        
	        String myHandJP = game.toJapanese(myChoice);
	        String opponentHandJP = game.toJapanese(opponentChoice);
	        
	        System.out.println("自分の手は " + myHandJP + ",対戦相手の手は " + opponentHandJP);
	        
	        String result = game.getResult(myChoice, opponentChoice);
	        System.out.println(result);
	    }

	}


