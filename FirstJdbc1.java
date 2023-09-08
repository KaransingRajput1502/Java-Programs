import java.sql.*;
class FirstJdbc1
{
	public static void main (String args[])
	{	
		try
		{
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creating connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="karan";

			Connection con=DriverManager.getConnection(url,username,password);
			if(con.isClosed())
			{
				System.out.println(" not connected");
			}
			else
			{
				System.out.println("Connection Created Or Connected");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}