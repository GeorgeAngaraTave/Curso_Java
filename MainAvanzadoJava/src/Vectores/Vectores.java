package Vectores;

import java.util.Vector;

public class Vectores {
	
	public static void main(String[] argumneto){
		Vector v1 = new Vector();
		Vector v2 = new Vector(10);
		Vector v3 = new Vector(v2);
		
		Vector <String> vector = new Vector<String>();
		vector.addElement("Cadena1");
		vector.addElement("cadena2");
		vector.insertElementAt("AJ",1);
		
		/**ACCEDER*/
		
		System.out.println(vector.get(2));
		System.out.println(vector.size());
		System.out.println(vector.elementAt(2));
		
		/**ELIMINAR*/
		
		System.out.println(vector.removeElement(1));
		System.out.println(vector.removeElement("AJ"));
		
		vector.removeAll(vector);
		
		/**OPERACIONES*/
		
		System.out.println(vector.contains("AJ"));
		System.out.println(vector.indexOf("AJ"));
	}
	
}
