package cert.clasesgenerales_02.math;

public class ClasePrincipal02 {
	
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.max(5, 10));
		System.out.println(Math.max(Math.E,Math.PI));
		System.out.println(Math.max(3.15, 3.14));
		
		System.out.println(Math.min(5, 10));
		System.out.println(Math.min(Math.E,Math.PI));
		System.out.println(Math.min(3.15, 3.14));
		
		System.out.println(Math.ceil(Math.PI)); // Aproxima por exceso
		System.out.println(Math.floor(Math.PI)); // Aproxima por defecto
		
		System.out.println(Math.round(Math.PI));
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.random()*100+1);
		
		for(int i=0; i<10; i++){
			System.out.print(Math.round(Math.random()*100+1)+"\t");	
		}
		
		
	}
	
}
