package Generico;

public class ClaseGen<T> {

		T objeto;
		
		public ClaseGen(T algo){
			objeto = algo;
		}
		
		public void tipoClase() {
			System.out.println("El objeto es: "+objeto.getClass().getName());
		}
		
		public static <T> String metodoGen(T x) {
			
			String dato = x.toString(); 
			
			return dato;
		}
}
