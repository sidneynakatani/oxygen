package br.com.sidney;

public class FlyweightDemo {
	
	public static void main(String[] a) {
		
		char[] word = {'G', 'r', 'e', 'e', 'n', ' ', 'a', 'p', 'p', 'l', 'e'};
		
		CharacterFactory characterFactory = new CharacterFactory();
		
		for(char c : word) {
			char cha = characterFactory.write(c);
			System.out.println("Write ["+cha+"]");
		}
		
	}

}
