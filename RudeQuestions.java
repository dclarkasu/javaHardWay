import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, color;
		int age, favorites;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old. " );
		System.out.print( "How much do you weigh, " + name + " ? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet! ! " );
		System.out.print( "Finally, what's your income, " + name + " ? " );
		income = keyboard.nextDouble();
		
		System.out.print( name + ", what is your favorite color? " );
		color = keyboard.next();
		
		System.out.println( "Can I call you " + color + "? " );
		System.out.print( "Do you have 1 or 2 favorite colors? " );
		favorites = keyboard.nextInt();
		System.out.println( "Why do you have " + favorites + " favorite colors? " );
		System.out.println();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
	}
}
		/* The program does not blow up when you enter an integer when it is expecting a 
		double because a double may have a fractional part, but it doesn't have to. 
		It can be an integer as well. */
		// Program did not blow up when entering numeric values for the string "name."
			//Probably because we did not specify that the String had to be anything other than entered via the keyboard.
		/* Program malfunctions any time you've specified what type of value to be entered (Double or Int) and you enter
		a non compatible value, like a String. */