package Busqueda;

public class BusquedaCaracteres {
	
	public static void main(String[] args) {
		
		String cadena = "Hola Jorge, Buenos d�as, Que tenFgas un buen d�a";
		String cadenab = "Estamos comiendo una sopa muy rica";
		
		int b;
		int buscar = 20;
		b = cadena.indexOf((int) 'F', buscar); // Posici�n donde se encuentra en la cadena
		System.out.println(b);
		
		int x;
		x = cadenab.lastIndexOf((int) 'y');
		System.out.println(x);
		
		x = cadenab.lastIndexOf("muy");
		System.out.println(x);
		
	}
}
