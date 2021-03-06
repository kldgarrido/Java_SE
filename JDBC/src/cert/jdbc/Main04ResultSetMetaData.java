package cert.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Main04ResultSetMetaData {

public static void main(String[] args) throws IOException {
		
		/*
		 * La ejecucion de una consulta de seleccion de registros a la
		 * base de datos, devuelve como resultado un objeto que ademas
		 * de disponer de un cursor para desplazarse por el conjunto de
		 * registros seleccionados, permite acceder a los valores de los
		 * campos. Este objeto implementa la interfaz ResultSet.
		 * ResultTest proporciona metodos para desplazarse por el conjunto
		 * de registros afectados por la consulta manipular sus contenidos.
		 * Un objeto ResultSet se crea al invocar al metodo executeQuery(String sql)
		 */

		// Credential
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String user = "postgres";
		String passw = "postgres";
		
		// Fields
		String name = "John";

		try{
			Connection cn;
			Statement st;
			ResultSet rs;
			Class.forName("org.postgresql.Driver");

			cn = DriverManager.getConnection(url,user, passw);
			st = cn.createStatement();

			String tsql;
			tsql = "SELECT id, name, lastname FROM client ";
			
			rs = st.executeQuery(tsql);
			ResultSetMetaData rm = rs.getMetaData();
			while(rs.next()){
				String out = "";
				out += rm.getColumnName(1)+":"+rs.getString(1)+" lenght:"+rm.getPrecision(1)+"\t";
				out += rm.getColumnName(2)+":"+rs.getString("name")+" type:"+rm.getColumnType(2)+"\t";
				out += rm.getColumnName(3)+":"+rs.getString(3)+" lenght:"+rm.getPrecision(3)+"\t";
				System.out.println(out);
			}
			
			rs.close();
			st.close();
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
