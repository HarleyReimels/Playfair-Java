/*Method: Grid
 * 
 * The codeWord method takes in the secret codeword, removes any duplicated letters and passed the value onto table.
 * The table method sorts out the alphabet into groups of 5 (last group having 6) and prints it out.
 * 
 * Author: Harley Reimels
 * Creation Date: 02/10/2023
 * 
 */



import java.util.ArrayList;

// Get Alphabet
public class grid {
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public ArrayList<String> table(String words) {

		ArrayList<String> row = new ArrayList<String>();
		String letter = "";
		Character character = ' ';
		words = words.toUpperCase();

		// Iterate through the codeword
		for (int i = 0; i < words.length(); ++i) {

			// Convert the character to string
			character = words.charAt(i);
			letter = character.toString();
			// Compare and delete letter in alphabet to codeword letter
			if (alphabet.contains(letter)) {
				alphabet = alphabet.replace(letter, "");
			}
		}
		// Combine codeword with new Alphabet
		alphabet = words.substring(0) + alphabet.substring(0);

		// Add each row to a String Array in groups of 5
		for (int i = 0; i < alphabet.length(); ++i) {
			if (i % 5 == 0 && i != 0) {
				row.add("\n" + alphabet.substring(i - 5, i));
			}
		}
		// Add final letter to last group
		row.set(4, row.get(4) + "/" + alphabet.charAt(alphabet.length() - 1));
		return row;
	}

	// Codeword, special word or phrase with duplicates removed
	public String newCodeWord(String sentence) {

		String uniqueLetters = " ";
		String codeWord = "";

		// Iterate over entire phrase / word
		for (int i = 0; i < sentence.length(); ++i) {
			// Get the current letter of word / phrase
			Character letter = sentence.charAt(i);
			// if letter not in unique Letters, add it
			if (!uniqueLetters.contains(letter.toString())) {
				uniqueLetters += uniqueLetters.substring(0) + letter;
				// Codeword is non-duplicated letters
				codeWord = codeWord.substring(0) + letter;
			}
		}
		return codeWord;
	}
}
