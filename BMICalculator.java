import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, in, lbs, bmi, meters;

		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();

		System.out.print( "Your height (inches): ");
		in = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		lbs = keyboard.nextDouble();

		// 39.3701 inches in a meter.
		meters = ( (feet*12) + in ) / 39.3701;

		// lbs/2.2 = kg
		bmi = (lbs/2.2) / (meters*meters);

		System.out.println( "Your bmi is " + bmi );
	}
}