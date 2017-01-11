import java.util.Scanner;


public class rpsValidator {
	
	public static String getChoiceString(Scanner keyboard, String prompt)
	{
		String i = "";
	    boolean isValid = false;
	    while (isValid == false)
	    {
	    	System.out.println(prompt);
	    	i = keyboard.next();
	        if (i.equalsIgnoreCase("R") || i.equalsIgnoreCase("Rock"))
	        {
	        	isValid = true;
	        }
	    	else if (i.equalsIgnoreCase("P") || i.equalsIgnoreCase("Paper"))
	        {
	        	isValid = true;
	        }
	    	else if (i.equalsIgnoreCase("S") || i.equalsIgnoreCase("Scissors"))
	        {
	        	isValid = true;
	        }
	    	else
	    	{
	    		System.out.println("Error! Please enter rock, paper, or scissors. Try again.");
	    	}
	        keyboard.nextLine();  // discard any other data entered on the line
	    }
	    return i;
	}
}
