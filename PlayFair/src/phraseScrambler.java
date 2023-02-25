/*Method:phraseChecker
 * 
 * The phrase checker method removes any character from the string that
 * is not alphabetical.
 * 
 * Author: Harley Reimels
 * Creation Date: 02/10/2023
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class phraseScrambler {

	// TODO: Accept secretPhrase
	// Delete any non-letter character
	// Cast to upper case
	// start scrambling

	public void phraseChecker(String phrase) {

		String phraseCheck = phrase;
		Character c = ' ';

		// FIXME: * breakes input
		for (int i = 0; i < phrase.length(); ++i) {
			c = phrase.charAt(i);
			if (!Character.isAlphabetic(c)) {
				phrase = phrase.replaceAll(c.toString(), "");
			}
		}
		phrase = phrase.toUpperCase();

		// Delete after testing
		System.out.println(phrase);
	}

	// The messageScrambler method takes user input, and finalLetter from the grid
	// Breaks the message down into groups of 2, of 2 letters are the same
	// It shifts the word right and replaces one of the letters with finalLetter
	public ArrayList<String> messageScrambler(String message, String letter) {

		ArrayList<String> scrambledMessage = new ArrayList<String>();

		// Remove all spaces from string
		message = message.replaceAll("\\s+", "");

		// Break word down into groups of 2
		try {
			for (int i = 0; i < message.length(); i = i + 2) {
				// If the 2 letters do not equal, we append both to scrambledMessage
				// TODO: try using the .equals method instead of ==
				if (!(message.substring(i, i + 1) == message.substring(i))) {
					scrambledMessage.add(message.substring(i, i + 2));
				}
			}
			// If we get index error, we append last letter of the grid
		} catch (Exception e) {
			
			// TODO: Replace "Q" with second to last letter
			// This prevents words like BLITZ from entering an infinite loop
			// ["BL", "IT", "ZZ", "ZZ"] etc.
			if (message.substring(message.length() - 1).equals(letter)) {
				scrambledMessage.add(message.substring(message.length() - 1) + "Q");
			} else {
				scrambledMessage.add(message.substring(message.length() - 1) + letter);
			}
		}
		// Iterating through all the groups in the arrayList
		Integer index = 0;
		for (String group : scrambledMessage) {

			// If 2 letters are identical
			if (group.charAt(0) == group.charAt(1)) {
				// Add the final letter between the identical letters
				scrambledMessage.set(index, group.substring(0, 1) + letter + group.substring(1));
				// Call reStringMessage to reString the ArrayList
				String reStringedMessage = messageReString(scrambledMessage);

				// TODO: change "ZZ" to last element of the ArrayList
				// This will break the infinite recursion loop if last letters are final letter
				if (scrambledMessage.get(scrambledMessage.size() - 1).equals("ZZ")) {
					break;
				} else {
					// If letters are identical, and not the final letter, use recursion of
					// MessageScrambler
					return messageScrambler(reStringedMessage, letter);
				}
			}
			// Increment index
			index += 1;
		}
		System.out.println(scrambledMessage);
		return scrambledMessage;
	}

	// The messageReString method, restrings an ArrayList
	public String messageReString(ArrayList<String> arrayMessage) {

		String reStringedMessage = "";
		
		// Loop through the ArrayList, appending each letter to a string
		for (String arrayGroups : arrayMessage) {
			reStringedMessage = reStringedMessage.substring(0) + arrayGroups;
		}
		return reStringedMessage;
	}
}
