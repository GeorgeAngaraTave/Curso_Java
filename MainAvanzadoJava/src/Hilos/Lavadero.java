package Hilos;

public class Lavadero extends Thread {

		private String nombre;
		private int tiempo ;
		
		public Lavadero(String n, int t){
			nombre = n;
			tiempo = t;
		}
		
		public void run(){

			try {
				sleep(tiempo);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("Terminamos "+nombre+" "+tiempo);
		}
		
}
