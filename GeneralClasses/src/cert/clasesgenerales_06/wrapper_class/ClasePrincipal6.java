package cert.clasesgenerales_06.wrapper_class;

public class ClasePrincipal6 {

	public static void main(String[] args) {
		int k = 23;
		Integer num1 = new Integer(k);
		
		String s = "4.65";
		Float float1 = new Float(s);
		
		// Recuperacion
		float float2 = float1.floatValue();
		int num2 = num1.intValue();

		// Conversion de cadena a tipo numerico
		String s1 = "25", s2 = "98.2";
		int n1 = Integer.parseInt(s1);
		double d = Double.parseDouble(s2);
		
		
		/*
		 * Autoboxing. Consiste en la encapsulacion de un dato basico
		 * a su clase envoltorio correspondiente. Y biceversa		
		 */
		int p = 5;
		Integer n2 = p;
		p = n2;
		
		float f1 = 2.5f;
		Float f2 = f1;
		f1 = f2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		b1 = b2;
		
	}

}
