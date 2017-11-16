package br.com.sidney;

public class Character {
	
	private char character;
	
	public Character(char character) {
		System.out.println("Created new Object: ["+character+"]");
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}
	
}
