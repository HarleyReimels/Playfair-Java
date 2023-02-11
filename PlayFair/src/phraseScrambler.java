/*Method:phraseChecker
 * 
 * The phrase checker method removes any character from the string that
 * is not alphabetical.
 * 
 * Author: Harley Reimels
 * Creation Date: 02/10/2023
 * 
 */



import java.util.Scanner;

public class phraseScrambler {

	//TODO: Accept secretPhrase
	//Delete any non-letter character
	//Cast to upper case
	//start scrambling
	
	public void phraseChecker(String phrase) {
		
		String phraseCheck = phrase;
		Character c = ' ';
		
		//FIXME: * breakes input
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
