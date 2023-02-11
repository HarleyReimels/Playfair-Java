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
		
		// Get codeword
		code = table.newCodeWord("hello worldyz");
		//Pass code into table
		myTable = table.table(code);
		System.out.println(myTable.get(0));
		System.out.println("Please enter the phrase you want to encode: ");
		secretPhrase = scnr.nextLine();
		
		// Verify if letters are alphabet
		pS.phraseChecker(secretPhrase);
		
	}

}
