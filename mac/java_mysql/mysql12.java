import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql12 {
	static void sql() {
		String url = "jdbc:mysql://localhost:3306/shopdb";
		String user = "root";
		String passwd = "";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			Statement stme = conn.createStatement();
			ResultSet resultset = stme.executeQuery("select * from indextbl");
			while (resultset.next()) {
				System.out.println(resultset.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		sql();
	}

}