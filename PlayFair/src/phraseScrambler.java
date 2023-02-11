import java.util.Scanner;

public class phraseScrambler {

	//TODO: Accept secretPhrase
	//Delete any non-letter character
	//Cast to upper case
	//start scrambling
	
	public void phraseChecker(String phrase) {
		
		String phraseCheck = phrase;
		Character c = ' ';
		
		// * is breaker input
		for ( int i = 0; i < phrase.length(); ++i) {
			c = phrase.charAt(i);
			if (!Character.isAlphabetic(c)) {
				phrase = phrase.replaceAll(c.toString(), "");
			}
		}
		phrase = phrase.toUpperCase();
		
		
		System.out.println(phrase);
	}
	
	// Group in groups of 2, if 2 letters are same, seperate them with final
	// letter from grid
	// If odd amount of letter make fin
}
