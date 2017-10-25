import java.util.Scanner;

public class MathTable {
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
	
	public static void printTitle() {
		System.out.println();
		System.out.printf("%-11s%-11s%-11s\n","Number", "Squared", "Cubed");
		System.out.printf("%-11s%-11s%-11s\n","======","=======","======");

	}

	public void printResults(int userNumber) {
		printTitle();
		printTable(userNumber);
	}
	
	public void printTable(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.printf("%-11d%-11d%-11d\n", i, this.squared(i), this.cubed(i));
		}
	}

	public int squared(int number) {
		return number * number;

	}

	public int cubed(int number) {
		return number * number * number;
	}

	public boolean repeatYesNo(Scanner sc) {		
		String string = sc.next();
		if (string.equalsIgnoreCase("Y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getUserInput(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.println("Please make sure to enter a whole number.");
			sc.nextLine();
		}
		
		return sc.nextInt();
	}


}