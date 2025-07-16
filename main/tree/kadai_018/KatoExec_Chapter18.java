package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 kato = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		kato.givenName = "太郎";
		ichiro.givenName = "一郎";
		hanako.givenName = "花子";
		
		kato.execIntroduce();
		kato.eachIntroduce();
		ichiro.execIntroduce();
		ichiro.eachIntroduce();
		hanako.execIntroduce();
		hanako.eachIntroduce();
		
		

	}

}
