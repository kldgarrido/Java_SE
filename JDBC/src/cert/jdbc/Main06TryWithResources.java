package cert.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main06TryWithResources {

	private static Connection getConnection(){
		// Credential
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String passw = "postgres";

		Connection cn = null;
		try {
			Class.forName("org.postgresql.Driver");
			cn = DriverManager.getConnection(url,user, passw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cn;

	}

	public static void main(String[] args) {


		// Fields
		String name = "John";
		
		String tsql = "SELECT id, name, lastname FROM client ";
		tsql += "WHERE name='"+name+"'";

		try(Connection cn = getConnection();
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery(tsql)
						){

			while(rs.next()){
				String out = "";
				out += rs.getString(1)+"\t";
				out += rs.getString("name") +"\t";
				out += rs.getString(3) +"\t";
				System.out.println(out);
			}

		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
