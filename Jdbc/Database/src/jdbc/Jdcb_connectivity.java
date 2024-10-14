package jdbc;
import java.sql.*;
public class Jdcb_connectivity {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database","root","Krishshandeep@2002");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3)+"    "+rs.getInt(4));
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
