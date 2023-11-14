import java.sql.*;
public class Insert_movieTicket_booking {
	public static void main(String[]args)throws Exception {
		insert();	
	}
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String Username="root";
		String password="root";
		String Query="insert into Movie_Ticket_booking values(?,?,?,?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1, "Rohini");
		pst.setString(2, " Chennai");
		pst.setString(3, "Japan");
		pst.setString(4, "2023-11-15");
		pst.setString(5, "10:00 PM");
		pst.setString(6, "L14");
		pst.setInt(7, 10);
		pst.setLong(8, 2000);
		pst.setString(9, "PAYTM");
		pst.executeUpdate();
		con.close();

		
	}

}
