package CompararCadena;

public class Mian {
	
	public static void main(String[] args) {
		// Se tiene en cuneta la numeración del codigo ASCII
		
		String cadenaA = "Hola";
		String cadenaB = "Hola";
		
		System.out.println(cadenaA.compareTo(cadenaB));
		
		String cadenaC = "Holo";
		
		System.out.println(cadenaA.compareTo(cadenaC));
		
		String cadenaD = "HOLA";
		
		System.out.println(cadenaA.compareTo(cadenaD));
		
	}
}
