package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address;
	
	//コンストラクタで共通設定を行う
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.address = "東京都中区○×";
	}
	
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
	}
}
