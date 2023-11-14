import java.sql.*;
public class Update_movieTicket_booking {
	public static void main(String[]args)throws Exception {
		update();
	}
	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String Username="root";
		String password="root";
		String Query="update Movie_Ticket_booking set select_date='2023-11-15' where Theatre_name='Kamala Cinemas'";
		Connection con=DriverManager.getConnection(url, Username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		
	}

}
