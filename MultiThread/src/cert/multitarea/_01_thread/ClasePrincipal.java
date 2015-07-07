package cert.multitarea._01_thread;

public class ClasePrincipal {
	
	public static void main(String[] args) {
//		Tarea1 t1 = new Tarea1();
//		Tarea2 t2 = new Tarea2();
//		
//		t1.start();
//		t2.start();
		
		Tarea t1 = new Tarea("Pepe");
		Tarea t2 = new Tarea("Ana");
		Tarea t3 = new Tarea("Juan");
		
//		t1.setPriority(5);
		
//		t1.start();
//		t2.start();
//		t3.start();
		
		t1.run();
	}

}
