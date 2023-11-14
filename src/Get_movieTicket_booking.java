import java.sql.*;
public class Get_movieTicket_booking {
	public static void main(String[]args)throws Exception {
		get();
	}
	public static void get() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String Username="root";
		String password="root";
		//select all
		//String Query="select * from Movie_Ticket_booking  ";
		String Query="select * from Movie_Ticket_booking where Theatre_name ='Sathyam Cinemas' ";
		Connection con=DriverManager.getConnection(url, Username, password);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("Theatre_name is :"+rs.getString(1));
			System.out.println("location is :"+rs.getString(2));
			System.out.println("Movie_name is :"+rs.getString(3));
			System.out.println("select_date is :"+rs.getString(4));
			System.out.println("show_time is :"+rs.getString(5));
			System.out.println("select_seat is :"+rs.getString(6));
			System.out.println("no_of_tickets is :"+rs.getInt(7));
			System.out.println("Ticket_price is :"+rs.getLong(8));
			System.out.println("payment_method is :"+rs.getString(9));
		}
		con.close();
		
	}
}

