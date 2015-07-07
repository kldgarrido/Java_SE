package cert.multitarea._01_thread;

public class Tarea extends Thread {
	
	public Tarea(String n) {
		super(n);
	}
	
	@Override
	public void run() {
		
		for(int i =0; i<=100; i++){
			System.out.println("Nombre "+Thread.currentThread().getName());
			Thread.yield();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
