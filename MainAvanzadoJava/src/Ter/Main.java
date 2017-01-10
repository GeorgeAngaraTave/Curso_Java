package Ter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 21;
		String cadena;
		
		if(numero<20){
			cadena = "menos";
		}else{
			cadena = "mas";
		}
		
		System.out.println(cadena);
		
		String cadenas2 = numero<20 ? "manos":"mas";
		
		System.out.println(cadenas2);
	}

}
