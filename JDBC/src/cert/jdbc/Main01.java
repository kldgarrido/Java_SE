package cert.jdbc;

public class Main01 {
	
	public static void main(String[] args) {
		
//		una consulta es cualquier expresión sql que defina una operacion a realizar sobre la base de datos.
		
		
		// <Sentencia_SELECT>
		/* La sentencia SELECT, es la mas importante y compleja de todas las 
		 * sentencias SQL.
		 * 
		 *  SELECT [field1, field2, ...] FROM [table1] [WHERE[criteria1, criteria2, ...]] [ORDER BY [field1]]
		 *  
		*/
		
		/* La clausula WHERE evalua un criterio que puede ser verdadero o falso.
		 * La forma general es: Campo operador valor.
		 * Condiciones:
		 * 1- Si el valor no es numerico deben utilizarce comillas
		 * 2- El valor puede ser el resultado de otra instruccion SELECT
		 * 3- La clausula WHERE puede incluir varias expresiones de este tipo vinculadas
		 * con el operador AND y OR
		 */
		
		/*
		 * La clausula ORDER BY determina como se van a ordenar los registros.
		 * Su forma general es: field1 ASC/DESC, field2 ASC/DESC, ...
		 * Tener en cuenta:
		 * 1. Si dos o mas registros poseen el mismo valor field1, se ordenara
		 * segun field2, y asi sucesivamente.
		 * 2. El modo de ordenacion puede ser ascendente(ASC) o descendente(DESC)
		 * 3. El modo de ordenacion predeterminado es ascendente(ASC).
		 */
		
		/*
		 * Ejemplo:
		 * 		SELECT *
		 * 		FROM pedidos
		 * 		WHERE fecha < #1/1/04# and pendiente = false
		 * 		ORDER BY coste DESC  
		 */
		
		/*
		 * Consultas SELECT sobre varias tablas:
		 * Se utiliza para obtener datos incluidos en mas de una tabla.
		 * Condiciones:
		 * 		1. Se debe utilizar la clausula FROM presedida de los nombres de las tablas,
		 * 		separados por coma. Ejemplo: FROM table1, table2
		 * 		2. Si alguno de los campos seleccionados tienen el mismo nombre, debemos
		 * 		poner antes del nombre del campo, el nombre de la tabla; de esta forma:
		 * 		table1.field1
		 * 		3. Cuando se realice una consulta sobre varias tablas se debe usar la clausula
		 * 		WHERE para establecer la relacion que ligue los datos de las tablas.
		 * 		De lo contrario se devolvera el producto cartesiano de las filas de ambas tablas.
		 * 		4. Para poder ligar dos tablas estas deben tener un campo en comun.
		 * 		   Ejemplo: WHERE table1.field3 = table2.field3
		 *		5. Ejemplo General:
		 *			SELECT name, from student, curse
		 *			WHERE student.id = cursos.id AND curso = "MYSQL"; 
		 */
		
		/*
		 * Instrucciones SELECT subordinadas:
		 * 			SELECT name, from student, curse
		 *			WHERE id =(SELECT id FROM cursos.id WHERE curso = "MYSQL"); 
		 */
		
		/* 
		 * La clausula WHERE puede incluir los siguiente operadores.
		 * 		1. Operadores basicos: <, >, =, <=, <=
		 * 		2. LIKE: Se utiliza para buscar campos que contengan combinaciones
		 *		de caracteres que cumplan ciertas condiciones: field1 LIKE contanst_alfanum.
		 *		Donde const_alfanum puede incluir cualquier caracter, tambien comodines con
		 *		significado especial:
		 *			% cadena de longitus aleatoria
		 *			- caracter no nulo
		 *			[x-y] caracter dentro del rango x-y
		 *		3. BETWEEN. Comprueba si un valor esta comprendido entre dos dados:
		 *			exp1 [NOT] BETWEEN exp2 AND exp3  
		 *			El resultado anterior es verdadero si exp1 esta comprendido entre
		 *			exp2 y exp3.
		 *			Ejemplo:
		 *				SELECT *
		 *				FROM pedidos
		 *				WHERE coste BETWEEN 100.000 and 200.000
		 *		4. IN. Comprueba si un valor esta incluido en la lista de valores
		 *			Forma General: exp IN (cte1, cte2, cte3, ...)
		 *			En vez de una lista de valores, tambien puede usarse una setencia SELECT. Ejemplo:
		 *				SELECT * FROM usarios WHERE id IN (SELECT id_us FROM pedidos WHERE unidades < 5)
		 */
		//</Sentencia_SELECT>
		
//		<Sentencia_INSERT>
		/*
		 * La sentecia INSERT se emplea para agregar una o mas filas a una tabla.
		 * 
		 * 1. Agregar filas individuales:
		 * 		INSERT INTO table(field1,field2) VALUES(value1,value2);
		 * 2. 
		 */
//		</Sentencia_INSERT>
		
//		<Sentencia_DELETE>
		/*
		 * La setencia DELETE se utiliza para borrar una o varios registros de una tabla.
		 * Formato: DELETE FROM table1 WHERE condition
		 * Ejemplo:
		 * 		DELETE FROM alumnos
		 * 		WHERE id_curso =
		 * 			(SELECT id_curso FROM cursos WHERE nomcurso="Access")
		 */
//		</Sentencia_DELETE>
		
//		<Sentencia_UPDATE>
		/*
		 * Esta sentencia tiene como funcion modificar los valores de ciertos campos en aquellos
		 * registros que cumplan una deteminada condicion.
		 * Formato General:
		 * 		UPDATE table1 SET field1 = expr1, field2 = expr2 WHERE condition.
		 * Ejemplo:
		 * 		UPDATE cursos SET precio = precio*0.95 WHERE nomcurso="access"
		 * 		La consulta anterior aplica un 5% de descuento a los cursos de access. 
		 */
//		</Sentencia_UPDATE>
		
		/*
		 * Utilizacion de JDBC para acceder a datos.
		 * 		1. Conexion a la base de datos.
		 * 			1.1. Carga del Driver.
		 * 				Class.forName(String clase_driver)
		 * 				Ejemplo:
		 *					Class.forName("org.postgresql.Driver");
		 *			1.2 Creacion de la conexion
		 *				Connection getConnection(String url)
		 *				Donde url representa la direccion de la base de datos y su formato es:
		 *					jdbc:subprotocolo:base_datos donde el subprotocolo depende del tipo
		 *					de driver utilizado y base_datos es el nombre de la base de datos.
		 *				Ejemplo:
		 *					 Connection c1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb");
		 *						Este metodo tambien se encuentra sobrecargado
		 *					 Connection c2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "123");
		 * 		2. Ejecucion de consultas.
		 * 			2.1 Creaccion del objeto STATEMENT.
		 * 				Las consultas SQL se manejan a travez de un objeto que implementa la interfaz statement.
		 * 				Statement st = c1.createStatement();
		 * 			2.2	Ejecucion de las consulta SQL.
		 * 				La interfaz STATEMENT proporciona diversos metodos para enviar una consulta SQL a travez de la conexion.
		 * 				Los mas importantes son:
		 * 
		 * 					- boolean execute(String sql)
		 * 						sql para [INSERT,UPDATE,DELETE) Devuelve false para indicar que no se generaron resultados.
		 * 						sql[SELECT] devuelve true
		 * 
		 * 					- int executeUpdate(String SQL)
		 * 							Envia una consulta de accion a la base de datos. 
		 * 							Devolviendo el numero de registros afectados por la accion
		 * 
		 * 					ResultSet executeQuery(String sql):
		 * 							Envia una consulta de seleccion de registros a la base de datos, devolviendo
		 * 							in objeto ResultSet para su manipulacion
		 * 		3. Manipulacion de registros.
		 * 		4. Cierre de la conexion. 
		 * 				st.close()
		 * 				c1.close()
		 */
		
		
	}

}
