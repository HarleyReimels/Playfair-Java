/* Method: Driver
 * The driver method is the main method.
 * 
 * Author: Harley Reimels
 * Creation Date: 02/10/2023
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		grid table = new grid();
		phraseScrambler pS = new phraseScrambler();
		//table.table();
		String code;
		ArrayList<String> myTable = new ArrayList<String>();
		Scanner scnr = new Scanner(System.in);
		String secretPhrase;
		String message;
		String lastLetter;
		String lastRow;
		
		
		// Get original codeword from user
		System.out.println("Please enter the phrase you want to encode: ");
		secretPhrase = scnr.nextLine();
		
		// Verify if letters are alphabet
		pS.phraseChecker(secretPhrase);
		
		// Get new revised codeword
		code = table.newCodeWord(secretPhrase);
		
		//Pass code into table
		myTable = table.table(code);
		
		// Getting the last letter of the table
		lastRow = myTable.get(4);
		lastLetter = lastRow.substring(lastRow.length()-1);
		System.out.println("THIS THIS THE FINAL LETTER: " + lastLetter);
		
		// Print the table
		for(int i = 0; i<5;++i) {
		System.out.println(myTable.get(i));
		}
		
		// Getting users message to decode
		System.out.println("What is your message: ");
		message = scnr.nextLine().toUpperCase();
		
		pS.messageScrambler(message, lastLetter);
	}

}
