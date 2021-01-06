package yes.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class YesDAO {
	private Connection conn= null;

public YesDAO() {
	try { 
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);

		System.out.println("Database에 연결되었습니다.\n");

	} catch (ClassNotFoundException cnfe) {
		System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
	} catch (SQLException sqle) {
		System.out.println("DB 접속실패 : " + sqle.toString());
	} catch (Exception e) {
		System.out.println("Unkonwn error");
		e.printStackTrace();
	}
} //생성자
 
  public boolean insertBoard(YesVO vo) {
	  String sql = "insert into yes(board_no, title, content, writer, creation_date)"
              +"values((select nvl(max(board_no),0)+1 from boards),?,?,?,sysdate) ";
	  int cnt=0;
	  try {
		PreparedStatement p = conn.prepareStatement(sql);
		p.setString(1, vo.getTitle());
		p.setString(2, vo.getContent());
		p.setString(3, vo.getWriter());
		cnt = p.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return cnt == 1 ? true : false;
	  
  }

}