import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathTable mathTable = new MathTable();
		
		boolean repeat = true;
		System.out.println("Learn your squares and cubes!");

		while (repeat) {
			System.out.print("\nEnter an integer: ");
			mathTable.printResults(mathTable.getUserInput(sc));

			System.out.println("\nContinue? (y/n)");
			repeat = mathTable.repeatYesNo(sc); // ask if user wants to continue
		}

		sc.close();
	}

}
