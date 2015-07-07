package cert.multitarea._04_comunicacion;

public class ClasePrincipal4 {
	
	public static void main(String[] args) {
		// Crea un objeto de la clase que realiza
		// El calculo y lo pone en ejecucion
		// concurrente con main
		Proceso p = new Proceso();
		p.start();
		
		// Aqui el metodo main() podra realizar cualquier tarea
		
		synchronized(p){
			try{
				p.wait();// Espera a que finaliza el calculo
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("La suma es "+p.getValor());
	}

}
