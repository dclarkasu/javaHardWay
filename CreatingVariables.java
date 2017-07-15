public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, z;
		double seconds, e, checking, savings;
		String firstName, lastName, title, myName, realName, rank;
		
		x = 10;
		y = 400;
		age = 39;
		z = 26;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 25500.50;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		rank = "SGT";
		myName = "Daniel";
		realName = "Clark";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + " in your checking account!" );
		System.out.println( "A goal could be to keep $" + savings + " in your savings." );
		System.out.println( "My name's not " + title + " " + firstName + lastName );
		System.out.println( "I used to go by " + rank + " " + myName + " " + realName + " " );
		System.out.println( "I am " + z + "years old." );
	}
}