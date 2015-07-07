package cert.multitarea._03_sincronizacion;

public class Tarea implements Runnable{

	private Accesos ac;

	public Tarea() {
		ac = new Accesos();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		synchronized(ac){
			int actual = ac.getValor();
			actual++;

			try {
				ac.wait(1000);
				ac.notify();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			ac.setValor(actual);
			System.out.println("Total de accesos "+ac.getValor());
			
		}
	}

}
