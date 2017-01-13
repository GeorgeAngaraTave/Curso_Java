package Hilos;

public class Main {

	public static void main(String[] args) {
		Lavadero l1, l2, l3;
		
		l1 = new Lavadero("Compacto", 10*1000);
		l2 = new Lavadero("Comioneta", 20*1000);
		l3 = new Lavadero("Mediano", 15*1000);

		l1.start();
		l2.start();
		l3.start();

	}

}
