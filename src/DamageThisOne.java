import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author Charlie Brown
	 * @version 9.0
	 * @date April 20, 3073
	 * @param void static main String()
	 */
	
	public static void main(String[] args) {
		//Scan this 
		int ticketNumber, stem, checkDigit;Scanner sc = new Scanner(System.in);
		
		/*Blah blah blah parameter blah blah blah
		 */
		System.out.print("Please enter a six-digit ticket number: ");ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
checkDigit = ticketNumber % 10;	

		/* This is how clyde write his code!!
		 */
		while (checkDigit != stem % 7) {
				System.out.println("That is NOT a valid ticket number, bucko!");System.out.print("Try again: ");
				ticketNumber = sc.nextInt();stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;	
		}
						
		System.out.println("That is a valid ticket number, well done!");
	
	}

}
