import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersCode {
	private static final Scanner input = new Scanner(System.in);
	
	//Method to display Thrice The Number
	private static void displayThriceTheNumber(int number) {
		int ans = number * 3;
		System.out.println(STR."\n\{number} Thrice is \{ans}");
	}

	//Method to display the Number Plus Five
	private static void displayNumberPlusFive(int number) {
		int ans = number + 5;
		System.out.println(STR."\{number} Plus Five is \{ans}");
	}

	//Method to display the Number Squared
	private static void displayNumberSquared(int number) {
		int ans = number * number;
		System.out.println(STR."\{number} Squared is \{ans}\n");
	}
	
	public static void main(String[] args) {
		//Three null integer variables
		Integer integer1 = null, integer2 = null, integer3 = null;

		//Validate the second input and assign to integer2
		System.out.println("Enter 3 integers separated by space.\n"); //Request the user to enter the values
		//Validate the first input and assign to integer1
		while(integer1 == null) {
			try { 
				integer1 = input.nextInt(); 
			} catch(InputMismatchException ex) {
				input.next(); 
				System.out.print("Invalid integer, please try again: ");
			}
		}
		//Validate the second input and assign to integer2
		while(integer2 == null) {
			try { 
				integer2 = input.nextInt(); 
			} catch(InputMismatchException ex) {
				input.next(); 
				System.out.print("Invalid integer, please try again: ");
			}
		}
		//Validate the 3rd input and assign to integer
		while(integer3 == null) {
			try { 
				integer3 = input.nextInt(); 
			} catch(InputMismatchException ex) {
				input.next(); 
				System.out.print("Invalid integer, please try again: ");
			}
		}

		
		//Passing each value to methods
		
		displayThriceTheNumber(integer1);
		displayNumberPlusFive(integer1);
		displayNumberSquared(integer1);

		displayThriceTheNumber(integer2);
		displayNumberPlusFive(integer2);
		displayNumberSquared(integer2);

		displayThriceTheNumber(integer3);
		displayNumberPlusFive(integer3);
		displayNumberSquared(integer3);
	}
}
