package text.section_04;

public class DbTable_1 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		
		try {
			//データベースに接続
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/java_db",
					"root",
					"mattsu0414"
					);
			
			System.out.println("データベース接続成功");
			
			//SQLクエリを準備
			statement = con.createStatement();
		}

	}

}
