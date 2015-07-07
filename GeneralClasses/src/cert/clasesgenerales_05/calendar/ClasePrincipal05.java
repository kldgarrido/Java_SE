package cert.clasesgenerales_05.calendar;

import java.util.Calendar;
import java.util.Date;

public class ClasePrincipal05 {
	
	public static void main(String[] args) {
		// Calendar es una clase abstracta.
		Calendar cal = Calendar.getInstance(); // Devuelve una subclase de calendar gracias al polimorfismo
		System.out.println(cal.getClass().getName());
		
		String fecha = "";
		fecha += cal.get(Calendar.DAY_OF_MONTH)+"/";
		fecha += (cal.get(Calendar.MONTH)+1)+"/";
		fecha += cal.get(Calendar.YEAR);
		System.out.println(fecha);
		
		cal.set(2014, 4, 29);
		System.out.println(cal.getTime());
		
		Date dt = new Date(200000000000L);
		cal.setTime(dt);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.YEAR, 24);
		System.out.println(cal.getTime());
		
		cal.set(Calendar.YEAR, 2015);
		System.out.println(cal.getTime());
		
		cal.set(1999, 11, 31);
		cal.add(Calendar.DAY_OF_MONTH, 1); // El dia afecta toda la fecha
		System.out.println(cal.getTime());
		
		cal.set(1999, 11, 31);
		cal.roll(Calendar.DAY_OF_MONTH, 1); // El dia no afecta el mes, ni el anno.
		System.out.println(cal.getTime());
		
		
		
		
		
	}

}
