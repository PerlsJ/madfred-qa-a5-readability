import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) 
	{
		//This is where your variables are declared
		
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		int eggs, dozen, singles;
		
		
		//This will prompt the user for information
		float dozens_cost, singlesCost, totalCost;
		Scanner kbrd = new Scanner(System.in);
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		dozen = eggs / 12;
		singles = eggs % 12;
		
		/*
		 * This part of the program will calculate the price
		 * of your eggs both singles and doubles
		 */
		dozens_cost = dozen * PRICE_PER_DOZEN;
		singlesCost = singles * PRICE_PER_SINGLE;
		totalCost = dozens_cost + singlesCost;
		
		//This part of the program will output the results and cost of the eggs
		 
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozen + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + singles + " singles at 45c, or $" + singlesCost);
		System.out.println("Your total cost is $" + totalCost);
		
	
	}

}
