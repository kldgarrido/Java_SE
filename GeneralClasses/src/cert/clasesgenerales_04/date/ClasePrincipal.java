package cert.clasesgenerales_04.date;

import java.util.Date;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		
		dt = new Date(200000000000L);
		System.out.println(dt);
		System.out.println(dt.getTime());
	}

}
