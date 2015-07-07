package cert.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;


public class Main02Insert {
	
	public static void main(String[] args) throws IOException {
		
		// Credential
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String passw = "postgres";
		
		// Fields
		String id = UUID.randomUUID().toString();
		String name = "John";
		String lastName = "Connor";
		
		try{
			Connection cn;
			Statement st;
			Class.forName("org.postgresql.Driver");
			
			cn = DriverManager.getConnection(url,user, passw);
			st = cn.createStatement();
			
			String tsql;
			tsql = "INSERT INTO client VALUES('";
			tsql += id + "','"+ name + "','" + lastName+"')";
			st.execute(tsql);
			cn.close();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
