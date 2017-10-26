/* Tim Johnson 
 * 10/26/17
 * Lab 3


*/import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathTable mathTable = new MathTable();
		
		boolean repeat = true;
		System.out.println("Learn your squares and cubes!");

		while (repeat) {
			System.out.print("\nEnter an integer: "); // prompt user for an integer
			
			mathTable.printResults(mathTable.getUserInput(sc)); // get & validate user input
																// using the MathTable Class

			System.out.println("\nContinue? (y/n)");
			repeat = mathTable.repeatYesNo(sc); // ask if user wants to continue, set repeat 
		}

		sc.close();
	}

}
