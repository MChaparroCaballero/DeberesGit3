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
		String[] palabras = texto.split("\\s+");

		System.out.println(
				"La cantidad de palabras en el texto es: " + contadordepalabras(texto) + frecuenciadepalabras(texto));
	}

	private static int contadordepalabras(String texto) {
		String[] palabras = texto.split("\\s+");
		int contadordepalabras = 0;
		for (String palabra : palabras) {
			// Si el String no está vacío, incrementar el contador
			contadordepalabras += (palabra.length() > 0) ? 1 : 0;
		}
		return contadordepalabras;
	}

	private static int frecuenciadepalabras(String texto) {

		String[] palabras = texto.split("\\s+");
		palabras = new String[1000000000];
		int repeticion = 0;
		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i] == palabras[i]) {
				repeticion = repeticion + 1;
			} else {
				repeticion = repeticion;

			}
		}
		
		return repeticion;

	}
	
	/*para la longitud de las palabras queria usar en principio un metodo static int donde dentro usaria el metodo length y el split separandolos en un array de caracteres pero no se como hcaer eso todavia pero por falta de tiempo y entendimiento no puedo*/	
	
	}

