package Generico;

public class MainG {

	public static void main(String[] args) {
		 
		ClaseGen<Integer> objInteger = new ClaseGen<Integer>(1);
		objInteger.tipoClase();
		
		ClaseGen<String> objString= new ClaseGen<String>("HOLA");
		objString.tipoClase();
		
		ClaseGen<Float> objFloat= new ClaseGen<Float>(1045f);
		objFloat.tipoClase();
		
		System.out.println(objInteger.metodoGen("H o l a U No 1"));
		System.out.println(objString.metodoGen(458799));

	}

}
