package kadai_010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scores_Chapter10 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement updateStmt = null;
		Statement selectStmt = null;
		ResultSet result = null;
		Scanner scanner = null;
		
		try {
			//データベースに接続
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/challenge_java",
					"root",
					"mattsu0414"
					);
			
			System.out.println("データベース接続成功:"  + con);
			
			String updatesql = "UPDATE scores SET score_math = 95, score_english = 80 WHERE id = 5;";
			updateStmt = con.prepareStatement(updatesql);
			
			System.out.println("レコード更新を実行します");
			int rowCnt = updateStmt.executeUpdate();
			System.out.println(rowCnt + "件のレコードが更新されました");
			
			//SQLクエリを準備
			String selectsql = "SELECT id, name, score_math, score_english FROM scores ORDER BY score_math DESC, score_english DESC;";
			selectStmt = con.createStatement();
			result = selectStmt.executeQuery(selectsql);
			
			System.out.println("数学・英語の点数が高い順に並べ替えました");
			
			//SQLクエリの実行結果を抽出
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				int score_math = result.getInt("score_math");
				int score_english = result.getInt("score_english");
				System.out.println(result.getRow() + "件目：生徒id=" + id + "/氏名=" + name + "/数学=" + score_math + "/英語=" + score_english);
			}
		}catch(InputMismatchException e) {
			System.out.println("入力が正しくありません");
		}catch(SQLException e) {
			System.out.println("エラー発生：" + e.getMessage());
		}finally {
			//使用したオブジェクトを解放
			if(scanner != null) {
				scanner.close();
			}
			if(updateStmt != null) {
				try {updateStmt.close();}catch(SQLException ignore) {}
			}
			if(con != null) {
				try {con.close();} catch(SQLException ignore) {}
			}
			if(selectStmt != null) {
				try {selectStmt.close();} catch(SQLException ignore) {}
			}
			if(result != null) {
				try {result.close();} catch(SQLException ignore) {}
			}
		}
		}

	}
