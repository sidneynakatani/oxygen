package br.com.sidney;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	
	private Map<String, Character> characters = new HashMap<String, Character>();
	

	public char write(char character) {
		
		Character charac = this.findCharacter(character);
		
		return charac.getCharacter();
	}
	

	private Character findCharacter(char character) {

		Character charac = null;

		if (characters.containsKey(String.valueOf(character))) {
			charac = characters.get(String.valueOf(character));
			
		} else {
			charac = new Character(character);
			characters.put(String.valueOf(character), charac);
		}

		return charac;

	}

}
