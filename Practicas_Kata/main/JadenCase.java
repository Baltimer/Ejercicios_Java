package main;

public class JadenCase {
	private String phrase = "";
	
	public JadenCase(){
		
	}
	public JadenCase(String phrase){
		this.phrase = phrase;
	}
	public String getPhrase(){
		return this.phrase;
	}
	public void setPhrase(char character){
		this.phrase += character;
	}
	
	public String toJadenCase(String phrase){
		if (phrase == null || phrase.length() == 0){
			return null;
		}
		char[] arrayPhrase = phrase.toCharArray();
		for (int i = 0; i < phrase.length(); i++){
			if (i == 0 || arrayPhrase[i - 1] == ' '){
				setPhrase(Character.toUpperCase(arrayPhrase[i]));
			} else{
				setPhrase(arrayPhrase[i]);
			}
		}
		return getPhrase();
	}
}
