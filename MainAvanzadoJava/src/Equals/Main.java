package Equals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***  Equals ***/
		System.out.println("/***  Equals ***/\n");
		String nombre = "Jose";
		String nombreA = "jose";
		
		if (nombre.equals(nombreA)) {
			
			System.out.println("Igules");
		}
		
		if (nombre.equalsIgnoreCase(nombreA)) {
					
					System.out.println("Igules, ignorando las mayusculas");
		}
		
		/***  startWith y endWith ***/
		System.out.println("/***  startWith y endWith ***/\n");
		
		String cadenaS = new String("Esta es una cadena");
		
		if(cadenaS.startsWith("Esta")){
			System.out.println("si");
		}else{
			System.out.println("NO");
		}
		
		if(cadenaS.endsWith("cadena")){
			System.out.println("si");
		}else{
			System.out.println("NO");
		}
		
		
		/**instrucción regionMatches **/
		System.out.println("/**instrucción regionMatches **/\n");
		
		String cadenaR = "Esta es la cadena a comparar";
		//Sin mayusculas
		System.out.println(cadenaR.regionMatches(true, 11, "cad", 0, 3));
		//Con mayusculas
		System.out.println(cadenaR.regionMatches(false, 11, "Cad", 0, 3));
	
		
		/** ChartAt **/
		System.out.println("/** ChartAt **/\n");
		
		String cadenaEje = "Esta es una cadena de ejemplo"; 
		
		// optener una letra en especifico d euna cadena
		System.out.println(cadenaEje.charAt(2));
		
		/** getChars **/
		System.out.println("/** getChars**/\n");
		
		char arreglo[] = new char[20];
		
		cadenaEje.getChars(0, 3, arreglo, 0);
		
		System.out.println(arreglo);
		
		/** SubString **/
		System.out.println("/** SubString**/\n");
		System.out.println(cadenaEje.substring(6, 14));
		System.out.println(cadenaEje.substring(9));
		
	}

}
