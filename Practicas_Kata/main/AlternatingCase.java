package main;

public class AlternatingCase {
	
	public static String toAlternativeString(String frase){
		String resultado = "";
		for (char c : frase.toCharArray()){
			if (Character.isLowerCase(c) == true){
				resultado += Character.toUpperCase(c);
			} else {
				resultado += Character.toLowerCase(c);
			} 
		}
		return resultado;
	}
}