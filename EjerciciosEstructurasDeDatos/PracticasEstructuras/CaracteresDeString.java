package org.foobarspam.Estructuras.main;

import java.util.TreeSet;

public class CaracteresDeString {
	public static void main(String[] args) {
		// Ejemplos para ejecutar
		String sinEspacios = "dabalearrozalazorraelabad";
		//String conEspacios = "dabale arroz a la zorra el abad";
		
		TreeSet <Character> caracteres = new TreeSet <Character>(); 

		for(int i = 0; i < sinEspacios.length(); i++) {
		   caracteres.add(sinEspacios.charAt(i)); 
		}
		  
		for(Character letra:caracteres){
		   System.out.print(letra + " ");
		}
	}
}