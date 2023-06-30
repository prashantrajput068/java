package DBMS;
import java.sql.*;
public class Sql_Ex1 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prashant","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select*from singh");
			while(rs.next())
			{
				System.out.println("uid="+rs.getInt(1));
				System.out.println("firstname="+rs.getString(2));
				System.out.println("password="+rs.getString(4));
				System.out.println("age="+rs.getInt(3));
				System.out.println("salary="+rs.getString(5));
				System.out.println("employe_id="+rs.getInt(6));
				System.out.println("*****");
			}
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("excp="+e);
		}
		catch(SQLException e)
		{
			System.out.println("excp="+e);
		}


	}



	}
