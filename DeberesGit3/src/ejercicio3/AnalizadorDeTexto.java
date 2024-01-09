package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalizadorDeTexto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("insertame un texto");
		InputStreamReader info;
		BufferedReader lector;
		info = new InputStreamReader(System.in);
		lector = new BufferedReader(info);
		String texto = lector.readLine();
		int contadorpalabras = 0;
		
		System.out.println(texto);
		 


	        System.out.println("La cantidad de palabras en el texto es: " + contadordepalabras(texto));
	    }
	
	  private static int contadordepalabras(String text) {
	        String[] palabras = text.split("\\s+");
	        int contadordepalabras = 0;
	        for (String palabra : palabras) {
	            // Si el String no está vacío, incrementar el contador
	            contadordepalabras += (palabra.length() > 0) ? 1 : 0;
	        }
	        return contadordepalabras;
	    }
	  
	  
		
	}


