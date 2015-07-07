package cert.multitarea._04_comunicacion;

public class Proceso extends Thread{

	private int valor;

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	@Override
	public void run() {
		/*
		 * Bloque de codigo sincronizado donde
		 * se obtiene el monitor del propio objeto
		 * Proceso para que ningun otro thread pueda utilizarlo mientras
		 * completa el calculo.
		 */
		
		synchronized(this){
			
			try {
				sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			for(int i = 1; i<= 100; i++){
				valor+=1;
			}
			this.notify();
			/*
			 * Avisa de que ha finalizado el calculo al thread
			 * que invoque a wait() sobre el objeto, a fin de que
			 * pueda continuar la ejecucion.
			 */
		}
	}

}
