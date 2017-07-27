import java.util.Scanner;

public class WeaselOrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println( "Type the word \"weasel\", please." );
		word = keyboard.next();
		
		yep = "weasel".equals(word);
		nope = ! word.equals("weasel");
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
	}
}
// ! Not operator required to compare 2 Strings
/*"weasel" and word are interchangeable on lines 12 & 13. I assume that's because weasel
is the word we entered. It's the same thing to the program. */