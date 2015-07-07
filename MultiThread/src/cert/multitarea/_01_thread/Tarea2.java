package cert.multitarea._01_thread;

public class Tarea2 extends Thread {
	
	@Override
	public void run() {
		
		for(int i =-1; i>=-100; i--){
			System.out.println("El numero es el "+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

}
