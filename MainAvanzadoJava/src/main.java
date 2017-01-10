
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		try {
			System.out.println("Bloque 1");
			int numero = Integer.parseInt("X");
			//System.out.println("Bloque 3");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bloque 2");
		}finally {
			System.out.println("Bloque 4");
		}
		*/
		
		try {
			System.out.println("Error probicado");
			throw new MiExepcion();
		} catch (MiExepcion e) {
			// TODO: handle exception
			System.out.println(e.exceptionError());
		}
	}

}
