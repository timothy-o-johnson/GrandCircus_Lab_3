/* Tim Johnson
 * 10/25/17
 * Grand Circus
 * Lab 3
*/

import java.util.Scanner;

public class MathTable {
	//
		
	boolean repeat = true;
	int userNumber = 0;

	public MathTable(int userNumber) {
		super();
		this.userNumber = userNumber;
	}
	
	public MathTable() {
		super();
		this.userNumber = 0;
	}
	
	public static void printHeaders() {
		// print column headers
		System.out.println();
		System.out.printf("%-11s%-11s%-11s\n","Number", "Squared", "Cubed");
		System.out.printf("%-11s%-11s%-11s\n","======","=======","======");

	}

	public void printResults(int userNumber) {
		// a short way to display the Header and Math Table 
		printHeaders();
		printTable(userNumber);
	}
	
	public void printTable(int number) {
		// print a table of the math functions
		for (int i = 1; i <= number; i++) {
			System.out.printf("%-11d%-11d%-11d\n", i, this.squared(i), this.cubed(i));
		}
	}

	public int squared(int number) {
		// takes in a number and returns its squares
		return number * number;

	}

	public int cubed(int number) {
		// takes in a number and returns its cube
		return number * number * number;
	}

	public boolean repeatYesNo(Scanner sc) {
		// takes in the user input converts to a boolean true for yes, false otherwise 
		String string = sc.next();
		if (string.equalsIgnoreCase("Y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getUserInput(Scanner sc) {
		// takes in user input ensures that it's an integer returns when it is
		while (!sc.hasNextInt()) {
			System.out.println("Please make sure to enter a whole number.");
			sc.nextLine();
		}
		
		return sc.nextInt();
	}


}