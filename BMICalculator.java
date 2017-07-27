import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		//double m, kg, bmi;
		int feet;
		double inches, pounds, height, bmi;
		
		System.out.print( "Your height in feet only: " );
		feet = keyboard.nextInt();
		
		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();
		height = feet * 12 + inches;
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble(); 
		
		//System.out.print( "Your height in m: " );
		//m = keyboard.nextDouble();
		
		//System.out.print( "Your weight in kg: " );
		//kg = keyboard.nextDouble();
		
		//bmi = kg / (m*m);
		//bmi = (pounds * 703) / (inches * inches);
		bmi = (pounds * 703) / (height * height);
		
		System.out.println( "Your BMI is " + bmi );
	}
}