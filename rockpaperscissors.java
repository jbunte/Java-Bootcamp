import java.util.Scanner;
import java.lang.Math;


public class rockpaperscissors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String computerChoice = "";
		String choice = "";
		String goAhead = "y";
		int win = 0;
		int tie = 0;
		int loss = 0;
		
		System.out.println("Welcome to the Rock, Paper, Scissors Game \n");
		
		while (goAhead.equalsIgnoreCase("y"))
		{
		choice = rpsValidator.getChoiceString(keyboard, "Choose: Rock, Paper, or Scissors: \n");
			
		int opponent = ((int)((Math.random() * 3) + 1));
		if (opponent == 1)
			computerChoice = "Rock";
		if (opponent == 2)
			computerChoice = "Paper";
		if (opponent == 3)
			computerChoice = "Scissors";

		System.out.println("Computer has chosen " + computerChoice);

		if (computerChoice.equalsIgnoreCase("Rock"))
		{
			if (choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("R"))
			{
				System.out.println("You both chose Rock -- it's a tie.");
				tie++;
			}
			else if (choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("P"))
			{
				System.out.println("Paper wraps Rock. You win!");
				win++;
			}
			else if (choice.equalsIgnoreCase("Scissors") || choice.equalsIgnoreCase("S"))
			{
				System.out.println("Rock breaks Scissors.  You lose!");
				loss++;
			}
		}
		if (computerChoice.equalsIgnoreCase("Paper"))
			{
				if (choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("R"))
				{
					System.out.println("Paper wraps Rock. You lose!");
					loss++;
				}
				else if (choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("P"))
				{
					System.out.println("You both chose Paper -- it's a tie.");
					tie++;
				}
				else if (choice.equalsIgnoreCase("Scissors") || choice.equalsIgnoreCase("S"))
				{
					System.out.println("Scissors cuts Paper.  You win!");
					win++;
				}
			}
		if (computerChoice.equalsIgnoreCase("Scissors"))
		{
			if (choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("R"))
			{
				System.out.println("Rock breaks Scissors. You win!");
				win++;
			}
			else if (choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("P"))
			{
				System.out.println("Scissors cuts Paper. You lose!");
				loss++;
			}
			else if (choice.equalsIgnoreCase("Scissors") || choice.equalsIgnoreCase("S"))
			{
				System.out.println("You both chose Scissors -- it's a tie.");
				tie++;
			}
		}
		System.out.println("\nWould you like to continue? (y/n)");
		goAhead = keyboard.next();

	}
		System.out.println("Your totals for this round are " + win + " win(s), " + loss + " loss(es), and " + tie + " tie(s).");
		if (win > loss)
			System.out.println("Great job this round! Thanks for playing!");
		else if (loss > win)
			System.out.println("Better luck next time. Goodbye!");
		else
			System.out.println("Thanks for playing.  Bye!");
	}
}
