import java.sql.*;
public class delete_movieTicket_booking {
	public static void main(String[]args)throws Exception {
		delete();
	}
	public static void delete() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String Username="root";
		String password="root";
		String Query="delete from Movie_Ticket_booking where select_date = '2016-11-23'";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		
	}

}
