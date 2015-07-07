package cert.multitarea._02_runnable;

public class ClasePrincipal2 {
	
	public static void main(String[] args) {
		TareaRb t = new TareaRb();
		
		Thread t1 = new Thread(t,"Pepe");
		Thread t2 = new Thread(t,"Ana");
		Thread t3 = new Thread(t,"Juan");
		
//		t1.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
