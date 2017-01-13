package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.midi.Synthesizer;

public class CopiarArchivo {
	
	/*public CopiarArchivo(String sourceFile, String destinationFile) {
		System.out.println("Desde: " + sourceFile);
		System.out.println("Hacia: " + destinationFile);

		try {
			File inFile = new File(sourceFile);
			File outFile = new File(destinationFile);

			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1)
				out.write(c);

			in.close();
			out.close();
		} catch(IOException e) {
			System.err.println("Hubo un error de entrada/salida!!!");
		}
	}

	public static void main(String args[]) {
		if(args.length == 2)
			new CopiarArchivo(args[0], args[1]);
		else
			System.out.println("Debe ingresar dos parametros");
	}*/
	public FileInputStream f1;
	public FileOutputStream f2;
	public byte[] b,s;
	public File archivoE, archivoS;
	
	public CopiarArchivo(String[] argumentos) {
		
		
		if (argumentos.length == 2) {
			
			try {
				archivoE = new File(argumentos[0]);
				archivoS = new File(argumentos[1]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.exit(0);
			}
			
		}else{
			System.out.println("Se tiene el original");
		}
	}
	
	public void dublicar(){
		
		System.out.println("Arrancamos "+System.currentTimeMillis());
		
		try {
			f1 = new FileInputStream(archivoE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f2 = new FileOutputStream(archivoS);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b = new byte[(int)archivoE.length()];
		System.out.println("Listo! "+System.currentTimeMillis());
		try {
			f1.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("terminamos de leer! "+System.currentTimeMillis());
		try {
			//int c;
			//while( (c = f1.read() ) != -1)
			f2.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			f1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("terminamos de Escribir! "+System.currentTimeMillis());
	}
	public static void main(String[] argumentos) {
		
		 CopiarArchivo cp = new CopiarArchivo(argumentos);
		 cp.dublicar();
		
	}
}
