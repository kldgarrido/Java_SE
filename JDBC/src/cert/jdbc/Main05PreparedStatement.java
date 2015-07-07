package cert.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Main05PreparedStatement {

	public static void main(String[] args) {
		// Credential
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String passw = "postgres";

		try{
			Connection cn;
			Class.forName("org.postgresql.Driver");
			cn = DriverManager.getConnection(url,user, passw);

			PreparedStatement ps;
			String tsql;

			tsql = "UPDATE client SET name=? WHERE id=?";
			ps = cn.prepareStatement(tsql);
			ps.setString(1, "Jack");
			ps.setString(2, "c0e2f344-d29c-4f1b-88d1-3d368d381235");
			
			ps.execute();
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}
}